import javax.swing.*;

class Game{
	public static void main(String args[])
	{
String g1;int flag=0;int flag2=0;int score=0;
//game 1
JOptionPane.showMessageDialog(null,"RULE:\nKnight Always Speaks the truth\nKnave Always Lies\nPress Ok if you are familiar with the RULE.","Game:1/Rule",JOptionPane.INFORMATION_MESSAGE);
g1=JOptionPane.showInputDialog(null,"A says that B is a Knight\nB says that we both are opposite\nWho is A?","A",JOptionPane.QUESTION_MESSAGE);
String ans="knave";

if(new String(g1).equals("knave"))
{
flag=1;
}
String g2=JOptionPane.showInputDialog(null,"Who is B?","B",JOptionPane.QUESTION_MESSAGE);
if(new String(g2).equals("knave"))
  {
  	flag2=1;
   }
   if(flag==1 && flag2==1)
   {
   	score=score+5;
   	JOptionPane.showMessageDialog(null,"Your answer is correct\nYour Score="+score,"Result",JOptionPane.INFORMATION_MESSAGE);
   }
   else
   {
   	score=score-5;
   	JOptionPane.showMessageDialog(null,"Your answer is not correct\nYour Score="+score,"Result",JOptionPane.INFORMATION_MESSAGE);
   }
//Game 2
   JOptionPane.showMessageDialog(null,"What 8 letter word can have a letter taken away and it still makes a word.Take another letter away and it still makes a word. Keep on doing that until you have one letter left. What is the word?","Game 2",JOptionPane.INFORMATION_MESSAGE);
   String g3=JOptionPane.showInputDialog(null,"Your Answer?","Answer",JOptionPane.QUESTION_MESSAGE);
   if(new String(g3).equals("starting"))
   {
   	score=score+5;
   	JOptionPane.showMessageDialog(null,"Your answer is correct\n Your score="+score,"Result",JOptionPane.INFORMATION_MESSAGE);
   }
   else
   {
   	score=score-5;
   		JOptionPane.showMessageDialog(null,"Your answer is not correct\nYour score="+score,"Result",JOptionPane.INFORMATION_MESSAGE);
   }
//game 3
   String q4=JOptionPane.showInputDialog(null,"The more you take, the more you leave behind. What am I?","Game 3",JOptionPane.INFORMATION_MESSAGE);
//String q4=JOptionPane.showInputDialog(null,"Answer?","Answer",JOptionPane.INFORMATION_MESSAGE);

if(new String(q4).equals("footsteps"))
{
	score=score+5;
	JOptionPane.showMessageDialog(null,"Answer is correct\nYour score="+score,"Result",JOptionPane.INFORMATION_MESSAGE);
}
else
{
	score=score-5;
JOptionPane.showMessageDialog(null,"Answer is not correct\nYour score="+score,"Result",JOptionPane.INFORMATION_MESSAGE);
}
//game 4
String g5=JOptionPane.showInputDialog(null," What starts with the letter "+"'t'"+", is filled with "+"'t'"+" and ends in "+"'t'"+"?\n","Game 4",JOptionPane.QUESTION_MESSAGE);
if(new String(g5).equals("teapot"))
{
	score=score+5;
	JOptionPane.showMessageDialog(null,"Your Answer is correct\nYour score="+score,"Result",JOptionPane.INFORMATION_MESSAGE);

}
else
{
	score=score-5;
	JOptionPane.showMessageDialog(null,"Your Answer is not correct\nYour score="+score,"Result",JOptionPane.INFORMATION_MESSAGE);
}



//Game Over
if(score<10)
{
	JOptionPane.showMessageDialog(null,"You Lose","Game Over",JOptionPane.ERROR_MESSAGE);
}
if(score>10)
{
	JOptionPane.showMessageDialog(null,"You've Won","Game Over",JOptionPane.INFORMATION_MESSAGE);
}

 }
}
