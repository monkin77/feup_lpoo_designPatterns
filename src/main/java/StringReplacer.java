public class StringReplacer implements StringTransformer{
    private char oldChar;
    private char newChar;

    public StringReplacer(char oldChar, char newChar){
        this.oldChar = oldChar;
        this.newChar = newChar;
    }

    public void execute(StringDrink drink){
        String newString = drink.getText().replace(this.oldChar, this.newChar);
        drink.setText(newString);
    }
}
