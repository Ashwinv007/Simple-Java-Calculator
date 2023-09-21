import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import java.util.ArrayList;

public class Calculator implements ActionListener{
     JFrame jf ;
     JLabel displayLabel;
boolean secondoperator = false;

boolean plusClicked = false;
boolean minusClicked = false;
boolean divisionClicked = false;
boolean multiplyClicked = false;
     boolean isOperatorClicked = false;
     boolean errorText = false;
    String oldValue;
    int currentOperator;  
     //Buttons
     JButton sevenButton;
     JButton clearButton;
     JButton eightButton;
     JButton nineButton;
     JButton fourButton;
     JButton fiveButton;
     JButton sixButton;
     JButton oneButton;
     JButton twoButton;
     JButton threeButton;
     JButton zeroButton;
     JButton dotButton;
     JButton equalButton;
     JButton divideButton;
     JButton multiplyButton;
     JButton subtractButton;
     JButton additionButton;

 

    public Calculator(){

         jf = new JFrame("Calculator");
    jf.setLayout(null);
    jf.setSize(600,600);
    jf.setLocation(200,150);
     displayLabel = new JLabel("0");
    displayLabel.setBounds(30,10,500,100);
    displayLabel.setBackground(Color.BLACK);
    displayLabel.setOpaque(true);
    displayLabel.setHorizontalAlignment(SwingConstants.RIGHT);
    displayLabel.setForeground(Color.WHITE);
    displayLabel.setFont(new Font("TERMINAL", Font.BOLD, 90));
    jf.add(displayLabel);



     sevenButton = new JButton("7");
    sevenButton.setBounds(30,130,80,80);
    sevenButton.setFont(new Font("Arial", Font.PLAIN, 40));
    sevenButton.addActionListener(this);
    jf.add(sevenButton);

     eightButton = new JButton("8");
    eightButton.setBounds(130,130,80,80);
    eightButton.setFont(new Font("Arial", Font.PLAIN, 40));
    eightButton.addActionListener(this);
    jf.add(eightButton);

     nineButton = new JButton("9");
    nineButton.setBounds(230,130,80,80);
    nineButton.setFont(new Font("Arial", Font.PLAIN, 40));
    nineButton.addActionListener(this);
    jf.add(nineButton);

     fourButton = new JButton("4");
    fourButton.setBounds(30,230,80,80);
    fourButton.setFont(new Font("Arial",Font.PLAIN, 40));
    fourButton.addActionListener(this);
    jf.add(fourButton);


     fiveButton = new JButton("5");
    fiveButton.setBounds(130,230,80,80);
    fiveButton.setFont(new Font("Arial", Font.PLAIN, 40));
    fiveButton.addActionListener(this);
    jf.add(fiveButton);


     sixButton = new JButton("6");
    sixButton.setBounds(230,230,80,80);
    sixButton.setFont(new Font("Arial", Font.PLAIN,40 ));
    sixButton.addActionListener(this);
    jf.add(sixButton);


     oneButton = new JButton("1");
    oneButton.setBounds(30,330, 80, 80);
    oneButton.setFont(new Font("Arial", Font.PLAIN, 40));
    oneButton.addActionListener(this);
    jf.add(oneButton);

     twoButton = new JButton("2");
    twoButton.setBounds(130,330,80,80);
    twoButton.setFont(new Font("Arial", Font.PLAIN, 40));
    twoButton.addActionListener(this);
    jf.add(twoButton);


     threeButton = new JButton("3");
    threeButton.setBounds(230,330,80,80);
    threeButton.setFont(new Font("Arial", Font.PLAIN, 40));
    threeButton.addActionListener(this);
    jf.add(threeButton); 



     zeroButton = new JButton("0");
    zeroButton.setBounds(30,430,80,80);
    zeroButton.setFont(new Font("Arial", Font.PLAIN, 40));
    zeroButton.addActionListener(this);
    jf.add(zeroButton);


     dotButton = new JButton(".");
    dotButton.setBounds(130,430,80,80);
    dotButton.setFont(new Font("Arial", Font.PLAIN, 40));
    dotButton.addActionListener(this);
    jf.add(dotButton);
 

     equalButton = new JButton("=");
    equalButton.setBounds(230,430,80,80);
    equalButton.setFont(new Font("Arial", Font.PLAIN, 40));
    equalButton.addActionListener(this);
    jf.add(equalButton);


     divideButton = new JButton("/");
    divideButton.setBounds(330,130,80,80);
    divideButton.setFont(new Font("Arial", Font.PLAIN, 40));
    divideButton.addActionListener(this);

    jf.add(divideButton);


     multiplyButton = new JButton("x");
    multiplyButton.setBounds(330,230,80,80);
        multiplyButton.setFont(new Font("Arial", Font.PLAIN, 40));
        multiplyButton.addActionListener(this);

    jf.add(multiplyButton);

    subtractButton = new JButton("-");
    subtractButton.setBounds(330,330,80,80);
    subtractButton.setFont(new Font("Arial", Font.PLAIN, 40));
    subtractButton.addActionListener(this);
    jf.add(subtractButton);


    additionButton = new JButton("+");
    additionButton.setBounds(330,430,80,80);
    additionButton.setFont(new Font("Arial", Font.PLAIN, 40));
    additionButton.addActionListener(this);

    jf.add(additionButton);

    clearButton = new JButton("Clear");
    clearButton.setBounds(430,430,120,80);
    clearButton.setFont(new Font("Arial", Font.PLAIN, 30));
    clearButton.addActionListener(this);
    jf.add(clearButton);




    jf.setVisible(true);

    jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
       
           //Label Text
      String  labelText = displayLabel.getText();

        Object source= e.getSource();
        if(source == sevenButton){
            if(isOperatorClicked){
                        displayLabel.setText(labelText+"7");
                        isOperatorClicked= false;


            }else{
                        displayLabel.setText(labelText+"7");

            }

        }
        else if(source == eightButton){
            if(isOperatorClicked){
                            displayLabel.setText(labelText+"8");
                            isOperatorClicked = false;


            }else{
                            displayLabel.setText(labelText+"8");

            }
        }
        else if(source == nineButton){
            if(isOperatorClicked){
                            displayLabel.setText("9");
                            isOperatorClicked = false;

            }else{            displayLabel.setText(labelText+"9");
}
        }
        else if(source == fourButton){
            if(isOperatorClicked){
displayLabel.setText(labelText+"4");
isOperatorClicked = false;


            }else{displayLabel.setText(labelText+"4");
}

        }
        else if(source== fiveButton){
            if(isOperatorClicked){
 displayLabel.setText(labelText+"5");
 isOperatorClicked = false;

            }else{            displayLabel.setText(labelText+"5");
}

        }
        else if(source == sixButton){
            if(isOperatorClicked){
 displayLabel.setText(labelText+"6");
 isOperatorClicked = false;
            }else{            displayLabel.setText(labelText+"6");
}
        }
        else if(source == oneButton){
            if(isOperatorClicked){
            displayLabel.setText(labelText+"1");
            isOperatorClicked =false;
            }else{            displayLabel.setText(labelText+"1");
}
        }
        else if(source == twoButton){
            if(isOperatorClicked){
                            displayLabel.setText(labelText+"2");
isOperatorClicked =false;

            }else{
                            displayLabel.setText(labelText+"2");

            }
             }
             else if(source == threeButton){
                if(isOperatorClicked){
displayLabel.setText(labelText+"3");
isOperatorClicked = false;
                }else{                displayLabel.setText(labelText+"3");
}
             }
             else if(source == zeroButton){
                if(isOperatorClicked){
  displayLabel.setText(labelText+"0");

                }else{                displayLabel.setText(labelText+"0");
}
             }
             else if(source == clearButton){
                displayLabel.setText("0");
                plusClicked = false;
                minusClicked = false;
                divisionClicked = false;
                multiplyClicked = false;
                errorText = true;
                isOperatorClicked = true;
secondoperator = false;           }

             else if(source == additionButton){
                if(plusClicked){
                    if(secondoperator == true){
                        isOperatorClicked = true;
         currentOperator = 1;
         plusClicked = true;
         currentCalculation();

             }else if(secondoperator == false){
                        isOperatorClicked = true;

         oldValue=displayLabel.getText();
         currentOperator = 1;
         currentCalculation();
             }

                }


                else if(minusClicked){
                     if(secondoperator == true){
                           isOperatorClicked = true;
            currentOperator = 2;
            minusClicked = false;
            plusClicked = true;
            currentCalculation();

                }else if(secondoperator == false){
                           isOperatorClicked = true;

            oldValue=displayLabel.getText();
            currentOperator = 2;
            currentCalculation();
                }
                }

                else if(divisionClicked){
                     if(secondoperator == true){
                           isOperatorClicked = true;
            currentOperator = 3;
            divisionClicked = false;
                        plusClicked = true;

            currentCalculation();

                }else if(secondoperator == false){
                           isOperatorClicked = true;

            oldValue=displayLabel.getText();
            currentOperator = 3;
            currentCalculation();
                }
                }

                else if(multiplyClicked){
                     if(secondoperator == true){
                           isOperatorClicked = true;
            currentOperator = 4;
            multiplyClicked = false;
                        plusClicked = true;

            currentCalculation();

                }else if(secondoperator == false){
                           isOperatorClicked = true;

            oldValue=displayLabel.getText();
            currentOperator = 4;
            currentCalculation();
                }
                }
                else{
                    if(secondoperator == true){
                        isOperatorClicked = true;
         currentOperator = 1;
plusClicked = true;
         currentCalculation();

             }else if(secondoperator == false){
                        isOperatorClicked = true;

         oldValue=displayLabel.getText();
         currentOperator = 1;
         plusClicked = true;

         currentCalculation();
             }
                    
                }
               
                                   displayLabel.setText(labelText+"+");
        


             }else if(source== subtractButton){

                   if(plusClicked){
                     if(secondoperator == true){
                           isOperatorClicked = true;
            currentOperator = 1;
            plusClicked = false;
            minusClicked = true;
            currentCalculation();

                }else if(secondoperator == false){
                           isOperatorClicked = true;

            oldValue=displayLabel.getText();
            currentOperator = 1;
            currentCalculation();
                }

                }


                else if(minusClicked){
                     if(secondoperator == true){
                           isOperatorClicked = true;
            currentOperator = 2;
            minusClicked = true;
            currentCalculation();

                }else if(secondoperator == false){
                           isOperatorClicked = true;

            oldValue=displayLabel.getText();
            currentOperator = 2;
            currentCalculation();
                }
                }

                else if(divisionClicked){
                     if(secondoperator == true){
                           isOperatorClicked = true;
            currentOperator = 3;
            divisionClicked = false;
                        minusClicked = true;

            currentCalculation();

                }else if(secondoperator == false){
                           isOperatorClicked = true;

            oldValue=displayLabel.getText();
            currentOperator = 3;
            currentCalculation();
                }
                }

                else if(multiplyClicked){
                     if(secondoperator == true){
                           isOperatorClicked = true;
            currentOperator = 4;
            multiplyClicked = false;
                        minusClicked = true;

            currentCalculation();

                }else if(secondoperator == false){
                           isOperatorClicked = true;

            oldValue=displayLabel.getText();
            currentOperator = 4;
            currentCalculation();
                }
                }
                else{
                     if(secondoperator == true){
                           isOperatorClicked = true;
            currentOperator = 2;
            minusClicked = true;
            currentCalculation();

                }else if(secondoperator == false){
                           isOperatorClicked = true;

            oldValue=displayLabel.getText();
            currentOperator = 2;
                        minusClicked = true;

            currentCalculation();
                }
                }

                                  displayLabel.setText(labelText+"-");

                
               
             }
             else if(source == divideButton){
                   if(plusClicked){
                     if(secondoperator == true){
                           isOperatorClicked = true;
            currentOperator = 1;
            plusClicked = false;
            divisionClicked = true;
            currentCalculation();

                }else if(secondoperator == false){
                           isOperatorClicked = true;

            oldValue=displayLabel.getText();
            currentOperator = 1;
            currentCalculation();
                }

                }


                else if(minusClicked){
                     if(secondoperator == true){
                           isOperatorClicked = true;
            currentOperator = 2;
            minusClicked = false;
                        divisionClicked = true;

            currentCalculation();

                }else if(secondoperator == false){
                           isOperatorClicked = true;

            oldValue=displayLabel.getText();
            currentOperator = 2;
            currentCalculation();
                }
                }

                else if(divisionClicked){
                     if(secondoperator == true){
                           isOperatorClicked = true;
            currentOperator = 3;
            divisionClicked = true;
            currentCalculation();

                }else if(secondoperator == false){
                           isOperatorClicked = true;

            oldValue=displayLabel.getText();
            currentOperator = 3;
            currentCalculation();
                }
                }

                else if(multiplyClicked){
                     if(secondoperator == true){
                           isOperatorClicked = true;
            currentOperator = 4;
            multiplyClicked = false;
                        divisionClicked = true;

            currentCalculation();

                }else if(secondoperator == false){
                           isOperatorClicked = true;

            oldValue=displayLabel.getText();
            currentOperator = 4;
            currentCalculation();
                }
                }
                else{
                    if(secondoperator == true){
                           isOperatorClicked = true;
            currentOperator = 3;
            divisionClicked = true;
            currentCalculation();

                }else if(secondoperator == false){
                           isOperatorClicked = true;

            oldValue=displayLabel.getText();
            currentOperator = 3;
                        divisionClicked = true;

            currentCalculation();
                }
                }

                             displayLabel.setText(labelText+"/");

             }

             else if(source == multiplyButton){
                   if(plusClicked){
                     if(secondoperator == true){
                           isOperatorClicked = true;
            currentOperator = 1;
            plusClicked = false;
            multiplyClicked = true;
            currentCalculation();

                }else if(secondoperator == false){
                           isOperatorClicked = true;

            oldValue=displayLabel.getText();
            currentOperator = 1;
            currentCalculation();
                }

                }


                else if(minusClicked){
                     if(secondoperator == true){
                           isOperatorClicked = true;
            currentOperator = 2;
            minusClicked = false;
                        multiplyClicked = true;

            currentCalculation();

                }else if(secondoperator == false){
                           isOperatorClicked = true;

            oldValue=displayLabel.getText();
            currentOperator = 2;
            currentCalculation();
                }
                }

                else if(divisionClicked){
                     if(secondoperator == true){
                           isOperatorClicked = true;
            currentOperator = 3;
            divisionClicked = false;
multiplyClicked = true;

            currentCalculation();

                }else if(secondoperator == false){
                           isOperatorClicked = true;

            oldValue=displayLabel.getText();
            currentOperator = 3;
            currentCalculation();
                }
                }

                else if(multiplyClicked){
                     if(secondoperator == true){
                           isOperatorClicked = true;
            currentOperator = 4;
            multiplyClicked = true;
            currentCalculation();

                }else if(secondoperator == false){
                           isOperatorClicked = true;

            oldValue=displayLabel.getText();
            currentOperator = 4;
            currentCalculation();
                }
                }
                else{
                         if(secondoperator == true){
                           isOperatorClicked = true;
            currentOperator = 4;
            multiplyClicked = true;
            currentCalculation();

                }else if(secondoperator == false){
                           isOperatorClicked = true;

            oldValue=displayLabel.getText();
            currentOperator = 4;
                        multiplyClicked = true;

            currentCalculation();
                }
                }

                                  displayLabel.setText(labelText+"*");

            
             }
             else if (source==dotButton){
                displayLabel.setText(labelText+".");
             }
             else if(source == equalButton){

                if(plusClicked){
                    currentOperator = 1;
                                    String displayResult = currentCalculation();
                                                    displayLabel.setText(displayResult+"");



                }
                else if(minusClicked){
                    currentOperator = 2;
                                    String displayResult = currentCalculation();
                                                    displayLabel.setText(displayResult+"");


                }
                else if(divisionClicked){
                    currentOperator = 3;
                                    String displayResult = currentCalculation();
                                                    displayLabel.setText(displayResult+"");


                }
                else if(multiplyClicked){
                    currentOperator = 4;
                                    String displayResult = currentCalculation();
                                                    displayLabel.setText(displayResult+"");


                }
                else{
                    displayLabel.setText("Syntax Error");
                    isOperatorClicked = true;
                    secondoperator = false;
                }


                


             }


         
    }

    public String newValueFinder(String[] args){
        String input = displayLabel.getText();
        String[] elements = input.split("\\s*(?=[+\\-*/])|(?<=[+\\-*/])\\s*");


        ArrayList<String> arrayList = new ArrayList<>();

        for(String element : elements){
            arrayList.add(element);
        }

        String newValueFromString = arrayList.get(arrayList.size() -1);
return newValueFromString;
    }

   

    public String currentCalculation(){
        

         String newValue  = newValueFinder(null);
                

                if(!(newValue == oldValue)){
                    float oldValueF = Float.parseFloat(oldValue);
                float newValueF = Float.parseFloat(newValue);

                  if(currentOperator == 1){
                                    float result = oldValueF+newValueF;
                                                    oldValue = (result+"");
                                                    isOperatorClicked = true;
                                                                                                        return(oldValue);





                }
                else if(currentOperator == 2){
                    float result = oldValueF-newValueF;
                    
                                                    oldValue = (result+"");
                                                    isOperatorClicked = true;
                                                                                                        return(oldValue);


                }
                else if(currentOperator==3){
                    float result = oldValueF/newValueF;
                                                    oldValue = (result+"");
                                                    isOperatorClicked = true;
                                                                                                        return(oldValue);


                }

                else if(currentOperator==4){
                    float result = oldValueF*newValueF;
                                                    oldValue = (result+"");
                                                    isOperatorClicked = true;
                                                    return(oldValue);

                }
                else{
                    displayLabel.setText("Syntax Error");
                    errorText = true;
                    isOperatorClicked = true;
                }


                secondoperator = true;



                return(oldValue);

                }else {
                    secondoperator = true;
                    System.out.println("new: " + newValue);
                    System.out.println("old: " + oldValue);
                }
return(oldValue);

              
    }
    

}


