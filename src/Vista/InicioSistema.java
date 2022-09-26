/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

import java.awt.*;
import java.awt.event.*;
import java.net.MalformedURLException;
import java.net.URL;
import javafx.application.Platform;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import static javafx.concurrent.Worker.State.FAILED;
import javafx.embed.swing.JFXPanel;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebEvent;
import javafx.scene.web.WebView;
import javax.swing.*;

public class InicioSistema extends javax.swing.JFrame implements Runnable {

    private JFXPanel jfxPanel;
    private WebEngine engine;

    private JFrame frame = new JFrame();
    private JPanel panel = new JPanel(new BorderLayout());
    private JPanel panelLogoTit = new JPanel();

    private JTextField txtURL = new JTextField();

    private javax.swing.JLabel LogoOAC;
    private javax.swing.JLabel TituloOAC;
    private javax.swing.JButton btnIngresoSistema;

    public JButton getBtnIngresoSistema() {
        return btnIngresoSistema;
    }

    public void setBtnIngresoSistema(JButton btnIngresoSistema) {
        this.btnIngresoSistema = btnIngresoSistema;
    }

    private void initComponents() {
        jfxPanel = new JFXPanel();

        createScene();
        btnIngresoSistema = new javax.swing.JButton();

        TituloOAC = new javax.swing.JLabel();
        LogoOAC = new javax.swing.JLabel();

        ActionListener al = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                loadURL(txtURL.getText());
            }
        };
        btnIngresoSistema.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-exit-48.png"))); // NOI18N
        btnIngresoSistema.setText("Ingresar al Sistema");
        transparenciaButton(btnIngresoSistema);
        btnIngresoSistema.setBorder(BorderFactory.createEmptyBorder(25, 5, 25, 5));
        TituloOAC.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        TituloOAC.setText("ORGANIZACIÓN DE AYUDA COMUNITARIA");
        TituloOAC.setBorder(BorderFactory.createEmptyBorder(25, 5, 25, 5));
        LogoOAC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Logo2.png"))); // NOI18N
        LogoOAC.setSize(new Dimension(40, 20));

        panelLogoTit.add(LogoOAC);
        panelLogoTit.add(TituloOAC);
        panelLogoTit.setBackground(Color.WHITE);

        panel.add(panelLogoTit, BorderLayout.NORTH);
        panel.add(btnIngresoSistema, BorderLayout.PAGE_END);
        panel.add(jfxPanel, BorderLayout.CENTER);
        panel.setBackground(Color.WHITE);
        frame.getContentPane().add(panel);

    }

    private void createScene() {

        Platform.runLater(new Runnable() {
            @Override
            public void run() {

                WebView view = new WebView();
                engine = view.getEngine();
                frame.setLocationRelativeTo(null);
                engine.titleProperty().addListener(new ChangeListener<String>() {
                    @Override
                    public void changed(ObservableValue<? extends String> observable, String oldValue, final String newValue) {
                        SwingUtilities.invokeLater(new Runnable() {
                            @Override
                            public void run() {

                            }
                        });
                    }
                });

                engine.setOnStatusChanged(new EventHandler<WebEvent<String>>() {
                    @Override
                    public void handle(final WebEvent<String> event) {
                        SwingUtilities.invokeLater(new Runnable() {
                            @Override
                            public void run() {
                            }
                        });
                    }
                });

                engine.locationProperty().addListener(new ChangeListener<String>() {
                    @Override
                    public void changed(ObservableValue<? extends String> ov, String oldValue, final String newValue) {
                        SwingUtilities.invokeLater(new Runnable() {
                            @Override
                            public void run() {
                                txtURL.setText(newValue);
                            }
                        });
                    }
                });

                engine.getLoadWorker().workDoneProperty().addListener(new ChangeListener<Number>() {
                    @Override
                    public void changed(ObservableValue<? extends Number> observableValue, Number oldValue, final Number newValue) {
                        SwingUtilities.invokeLater(new Runnable() {
                            @Override
                            public void run() {
                            }
                        });
                    }
                });

                engine.getLoadWorker()
                        .exceptionProperty()
                        .addListener(new ChangeListener<Throwable>() {

                            public void changed(ObservableValue<? extends Throwable> o, Throwable old, final Throwable value) {
                                if (engine.getLoadWorker().getState() == FAILED) {
                                    SwingUtilities.invokeLater(new Runnable() {
                                        @Override
                                        public void run() {
                                            JOptionPane.showMessageDialog(
                                                    panel,
                                                    (value != null)
                                                            ? engine.getLocation() + "\n" + value.getMessage()
                                                            : engine.getLocation() + "\nUnexpected error.",
                                                    "Loading error...",
                                                    JOptionPane.ERROR_MESSAGE);
                                        }
                                    });
                                }
                            }
                        });

                jfxPanel.setScene(new Scene(view));
            }
        });
    }

    public void loadURL(final String url) {
        Platform.runLater(new Runnable() {
            @Override
            public void run() {
                String tmp = toURL(url);

                if (tmp == null) {
                    tmp = toURL("http://" + url);
                }

                engine.load(tmp);
            }
        });
    }

    private static String toURL(String str) {
        try {
            return new URL(str).toExternalForm();
        } catch (MalformedURLException exception) {
            return null;
        }
    }

    @Override
    public void dispose() {
        frame.dispose();
    }

    @Override
    public void run() {

        frame.setPreferredSize(new Dimension(1024, 600));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        initComponents();

        loadURL("file:///C://Users/chris/Documents/NetBeansProjects/ProyectoFOCA/src/html/index.html");

        frame.pack();
        frame.setVisible(true);
    }

    public void transparenciaButton(JButton boton) {
        boton.setOpaque(false);
        boton.setContentAreaFilled(false);
        boton.setBorderPainted(false);
    }
}
