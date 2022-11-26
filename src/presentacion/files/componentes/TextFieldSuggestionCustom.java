package presentacion.files.componentes;

import javax.swing.JTextField;

public class TextFieldSuggestionCustom extends JTextField {

    private TextFieldSuggestionUICustom textUI;

    public TextFieldSuggestionCustom () {
        textUI = new TextFieldSuggestionUICustom(this);
        setUI(textUI);
    }

    public void addItemSuggestion (String text) {
        textUI.getItems().add(text);
    }

    public void removeItemSuggestion (String text) {
        textUI.getItems().remove(text);
    }

    public void clearItemSuggestion () {
        textUI.getItems().clear();
    }

    public void setRound (int round) {
        textUI.setRound(round);
    }

    public int getRound () {
        return textUI.getRound();
    }

}
