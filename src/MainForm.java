
import javax.swing.*;
import javax.swing.table.TableColumn;
import java.awt.*;

class MainForm extends JFrame {
    private int width = 1000;
    private int height = 400;
    private String[] tables;
    private String[] queries = {"SELECT", "DELETE", "UPDATE"};
//    private String url = "jdbc:mysql://localhost:3306/larablog?useLegacyDatetimeCode=false&serverTimezone=Europe/Kiev";
//    private String username = "root";
//    private String pass = "";

    MainForm() {
        super("LAB2 - DB");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setSize(this.width, this.height);

        JMenuBar jMenuBar = new JMenuBar();

        JMenu jmFile = new JMenu("Файл");

        JMenuItem jmiOpen = new JMenuItem("Открыть");
        JMenuItem jmiSave = new JMenuItem("Сохранить");
        JMenuItem jmiClose = new JMenuItem("Закрыть");

        jmFile.add(jmiOpen);
        jmFile.add(jmiSave);
        jmFile.add(jmiClose);

        jMenuBar.add(jmFile);

        JMenu jmEdit = new JMenu("Редактировать");

        JMenuItem jmiCopy = new JMenuItem("Копировать");
        JMenuItem jmiDelete = new JMenuItem("Удалить");
        JMenuItem jmiPaste = new JMenuItem("Вставить");

        jmEdit.add(jmiCopy);
        jmEdit.add(jmiDelete);
        jmEdit.add(jmiPaste);

        jMenuBar.add(jmEdit);

        JMenu jmWindow = new JMenu("Окно");

        JMenuItem jmiCascade = new JMenuItem("Каскадом");
        JMenuItem jmiShowAll = new JMenuItem("Показать все");
        JMenuItem jmiCloseAll = new JMenuItem("Закрыть все");

        jmWindow.add(jmiCascade);
        jmWindow.add(jmiShowAll);
        jmWindow.add(jmiCloseAll);

        jMenuBar.add(jmWindow);

        // Комбобоксы
        JTextArea txtArea = new JTextArea();
        JComboBox comboTable = new JComboBox();
        JComboBox comboColumn = new JComboBox();
        JComboBox comboQuery = new JComboBox(queries);
        JLabel labelQuery = new JLabel("Запрос");
        JLabel labelTable = new JLabel("Таблица");
        JLabel labelColumn = new JLabel("Где");

        // поле ввода
        JTextField textField = new JTextField();
        JLabel labelWhere = new JLabel(" = ");

        // кнопка
        JButton jButton1 = new JButton("Выполнить");

        // таблица
        String[] tColumns = {"ID", "Name"};

        Object[][] tData = {
                { 1, "Name" },
                { 2, "Name2" }
        };

        JTable jTable = new JTable(tData, tColumns);

        // панели
        JPanel jPanel = new JPanel();
        JPanel jPanelCombo = new JPanel();
        JPanel jPanelContent = new JPanel();

        jPanel.setLayout(new BoxLayout(jPanel, BoxLayout.Y_AXIS));
        jPanel.add(jButton1);

        jPanelCombo.setLayout(new BoxLayout(jPanelCombo, BoxLayout.X_AXIS));
        jPanelCombo.add(labelQuery);
        jPanelCombo.add(comboQuery);
        jPanelCombo.add(labelTable);
        jPanelCombo.add(comboTable);
        jPanelCombo.add(labelColumn);
        jPanelCombo.add(comboColumn);
        jPanelCombo.add(labelWhere);
        jPanelCombo.add(textField);

        jPanelContent.setLayout(new BoxLayout(jPanelContent, BoxLayout.X_AXIS));
        jPanelContent.add(txtArea);
        jPanelContent.add(jTable);
        // DATABASE Init

        // пункт меню Закрыть
        jmiClose.addActionListener(e -> {

        });

        // пункт меню Открыть
        jmiOpen.addActionListener(e -> {

        });

        // комбо выбор таблицы
        comboTable.addActionListener( e -> {

        });


        // кнопка Выполнить
        jButton1.addActionListener(e -> {

        });

        this.setJMenuBar(jMenuBar);
        this.setLayout(new BorderLayout());
        this.add(jPanel, BorderLayout.SOUTH);
        this.add(jPanelCombo, BorderLayout.NORTH);
        this.add(jPanelContent, BorderLayout.CENTER);
    }


}
