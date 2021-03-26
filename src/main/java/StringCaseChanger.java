public class StringCaseChanger implements StringTransformer{
    public void execute(StringDrink drink){
        String str1 = drink.getText();
        StringBuffer strb = new StringBuffer(str1);
        for(int i = 0; i < str1.length(); i++){
            if(Character.isLowerCase(str1.charAt(i))){
                strb.setCharAt(i, Character.toUpperCase(str1.charAt(i)));
            }
            else {
                strb.setCharAt(i, Character.toLowerCase(str1.charAt(i)));
            }
        }
        drink.setText(strb.toString());
    }
}
