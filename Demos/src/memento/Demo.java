package memento;

public class Demo {
    public static void show(){
        System.out.println("============== MEMENTO PATTERN DEMO =================");
        var editor = new Editor();
        var history = new History();

        history.push(editor.createState());
        System.out.println(editor.getContent()); // null

        editor.setContent("A");
        System.out.println(editor.getContent()); // A
        history.push(editor.createState());

        editor.setContent("B");
        System.out.println(editor.getContent()); // B
        history.push(editor.createState());

        editor.setContent("D");
        System.out.println(editor.getContent()); // D

        editor.restore(history.pop()); // Undo
        System.out.println(editor.getContent()); // B

        editor.setContent("C");
        System.out.println(editor.getContent()); // C
        history.push(editor.createState());

    }
}
