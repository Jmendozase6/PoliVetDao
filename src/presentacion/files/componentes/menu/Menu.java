package presentacion.files.componentes.menu;

import businessobject.UsuarioActivo;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.util.ArrayList;
import java.util.List;
import javaswingdev.GoogleMaterialDesignIcon;
import presentacion.files.componentes.swing.scroll.ScrollBar;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import net.miginfocom.swing.MigLayout;

public class Menu extends JPanel {

    private int index = -1;
    private final List<EventMenuSelected> events = new ArrayList<>();

    public Menu () {
        init();
        agregarItems();
    }

    private void agregarItems () {
        switch (UsuarioActivo.idRol) {
            case 1: {
                addTitle("ADMINISTRADOR");
                addMenuItem(new ModelMenuItem(GoogleMaterialDesignIcon.DASHBOARD, "Inicio"));                   // 0
                addTitle("USUARIOS");
                addMenuItem(new ModelMenuItem(GoogleMaterialDesignIcon.PERSON, "Clientes"));                    // 1
                addMenuItem(new ModelMenuItem(GoogleMaterialDesignIcon.PERSON, "Veterinarios"));                // 2
                addMenuItem(new ModelMenuItem(GoogleMaterialDesignIcon.PERSON, "Proveedores"));                 // 3
                addTitle("VENTAS");
                addMenuItem(new ModelMenuItem(GoogleMaterialDesignIcon.HISTORY, "Detalles de Ventas"));         // 4
                addMenuItem(new ModelMenuItem(GoogleMaterialDesignIcon.PIE_CHART, "Estadísticas"));             // 5
                addTitle("INVENTARIO");
                addMenuItem(new ModelMenuItem(GoogleMaterialDesignIcon.ACCESSIBILITY, "Productos"));            // 6
                addTitle("CITAS");
                addMenuItem(new ModelMenuItem(GoogleMaterialDesignIcon.HISTORY, "Reserva de Citas"));           // 7
                addMenuItem(new ModelMenuItem(GoogleMaterialDesignIcon.TIMELINE, "Citas Programadas"));         // 8
            }
            break;
            case 2: {
                addTitle("CLIENTE");
                addMenuItem(new ModelMenuItem(GoogleMaterialDesignIcon.DASHBOARD, "Inicio"));                   // 0
                addTitle("COMPRAS");
                addMenuItem(new ModelMenuItem(GoogleMaterialDesignIcon.HISTORY, "Detalles de mis compras"));    // 1
                addMenuItem(new ModelMenuItem(GoogleMaterialDesignIcon.PIE_CHART, "Estadísticas"));             // 2
                addTitle("INVENTARIO");
                addMenuItem(new ModelMenuItem(GoogleMaterialDesignIcon.ACCESSIBILITY, "Productos"));            // 3
            }
            break;
            case 3: {
                addTitle("PROVEEDOR");
                addMenuItem(new ModelMenuItem(GoogleMaterialDesignIcon.DASHBOARD, "Inicio"));                   // 0
            }
            break;
            case 4: {
                addTitle("VETERINARIO");
                addMenuItem(new ModelMenuItem(GoogleMaterialDesignIcon.DASHBOARD, "Inicio"));                   // 0
                addTitle("MASCOTAS");
                addMenuItem(new ModelMenuItem(GoogleMaterialDesignIcon.TIMELINE, "Mascotas"));                  // 1
                addMenuItem(new ModelMenuItem(GoogleMaterialDesignIcon.TIMELINE, "Tarjetas de Vacuna"));        // 2
                addTitle("RESERVAS");
                addMenuItem(new ModelMenuItem(GoogleMaterialDesignIcon.HISTORY, "Reserva de Citas"));           // 3
                addMenuItem(new ModelMenuItem(GoogleMaterialDesignIcon.TIMELINE, "Citas Programadas"));         // 4
            }
            break;
        }
        addTitle("CONFIGURACIÓN");
        addMenuItem(new ModelMenuItem(GoogleMaterialDesignIcon.ACCESSIBILITY, "Configuración", "Editar Perfil", "Color de alertas", "Cerrar Sesión"));

    }

    private void init () {
        setBackground(Color.WHITE);
        setLayout(new BorderLayout());
        JScrollPane scroll = createScroll();
        panelMenu = createPanelMenu();
        scroll.setViewportView(panelMenu);
        scroll.getViewport().setOpaque(false);
        scroll.setViewportBorder(null);
        add(scroll);
    }

    private JScrollPane createScroll () {
        JScrollPane scroll = new JScrollPane();
        scroll.setBorder(null);
        scroll.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        scroll.setVerticalScrollBar(new ScrollBar());
        return scroll;
    }

    private JPanel createPanelMenu () {
        JPanel panel = new JPanel();
        panel.setOpaque(false);
        menuLayout = new MigLayout("wrap,fillx,inset 0,gapy 0", "[fill]");
        panel.setLayout(menuLayout);

        return panel;
    }

    private JPanel createMenuItem (ModelMenuItem item) {
        MenuItem menuItem;
        menuItem = new MenuItem(item, ++index, menuLayout);
        menuItem.addEvent(new EventMenuSelected() {
            @Override
            public void menuSelected (int index, int indexSubMenu) {
                if (!menuItem.isHasSubMenu() || indexSubMenu != 0) {
                    clearSelected();
                    setSelectedIndex(index, indexSubMenu);
                }
            }
        });
        return menuItem;
    }

    private void runEvent (int index, int indexSubMenu) {
        for (EventMenuSelected event : events) {
            event.menuSelected(index, indexSubMenu);
        }
    }

    //  Public Method
    public void addMenuItem (ModelMenuItem menu) {
        panelMenu.add(createMenuItem(menu), "h 35!");
    }

    public void addTitle (String title) {
        JLabel label = new JLabel(title);
        label.setBorder(new EmptyBorder(15, 20, 5, 5));
        label.setFont(new Font("Monospaced", Font.BOLD, 14) {
        });
        label.setForeground(new Color(82, 183, 136));
        panelMenu.add(label);
    }

    public void addSpace (int size) {
        panelMenu.add(new JLabel(), "h " + size + "!");
    }

    public void setSelectedIndex (int index, int indexSubMenu) {
        for (Component com : panelMenu.getComponents()) {
            if (com instanceof MenuItem) {
                MenuItem item = (MenuItem) com;
                if (item.getIndex() == index) {
                    item.setSelectedIndex(indexSubMenu);
                    runEvent(index, indexSubMenu);
                    break;
                }
            }
        }
    }

    public void clearSelected () {
        for (Component com : panelMenu.getComponents()) {
            if (com instanceof MenuItem) {
                MenuItem item = (MenuItem) com;
                item.clearSelected();
            }
        }
    }

    public void addEvent (EventMenuSelected event) {
        events.add(event);
    }

    private MigLayout menuLayout;
    private JPanel panelMenu;
}
