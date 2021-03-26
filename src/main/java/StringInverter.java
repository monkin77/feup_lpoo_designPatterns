public class StringInverter implements StringTransformer{
    public void execute(StringDrink drink){    // inverts the string
        StringBuilder sbr = new StringBuilder(drink.getText());
        sbr.reverse();
        drink.setText(sbr.toString());
    };
}
