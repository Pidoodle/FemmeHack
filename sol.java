package com.example.lisa.playingcardworkout;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import static android.R.attr.button;

public class sol extends AppCompatActivity {
    int cardSize = 52;
    ImageView image;
    ImageView player1card;
    ImageView player2card;
    TextView p1nam;
    TextView p2nam;
    int count=0;
    Button buton;
    String p1card;
    String p2card;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sol);

        ArrayList<Card> p1=new ArrayList<Card>();
        ArrayList<Card> p2=new ArrayList<Card>();

        buton=(Button)findViewById(R.id.play_id);
        p1nam=(TextView)findViewById(R.id.p1name_id);
        p2nam=(TextView)findViewById(R.id.p2name_id);
        Intent intent=getIntent();
        p1nam.setText(intent.getStringExtra("NAME"));
        p2nam.setText(intent.getStringExtra("Name2"));






        final ArrayList <Card> cards = new ArrayList<Card>();

        Card card1=new Card("Ace of Clubs",1,R.drawable.ace_of_clubs);
        cards.add(card1);
        card1=new Card("2 of Clubs",2,R.drawable.two_of_clubs);
        cards.add(card1);
        card1=new Card("3 of Clubs",3,R.drawable.three_of_clubs);
        cards.add(card1);
        card1=new Card("4 of Clubs",4,R.drawable.four_of_clubs);
        cards.add(card1);
        card1=new Card("5 of Clubs",5,R.drawable.five_of_clubs);
        cards.add(card1);
        card1=new Card("6 of Clubs",6,R.drawable.six_of_clubs);
        cards.add(card1);
        card1=new Card("7 of Clubs",7,R.drawable.seven_of_clubs);
        cards.add(card1);
        card1=new Card("8 of Clubs",8,R.drawable.eight_of_clubs);
        cards.add(card1);
        card1=new Card("9 of Clubs",9,R.drawable.nine_of_clubs);
        cards.add(card1);
        card1=new Card("10 of Clubs",10,R.drawable.ten_of_clubs);
        cards.add(card1);
        card1=new Card("Jack of Clubs",11,R.drawable.jack_of_clubs);
        cards.add(card1);
        card1=new Card("Queen of Clubs",12,R.drawable.queen_of_clubs);
        cards.add(card1);
        card1=new Card("King of Clubs",13,R.drawable.king_of_clubs);
        cards.add(card1);
        card1=new Card("Ace of Diamond",14,R.drawable.ace_of_diamonds);
        cards.add(card1);
        card1=new Card("2 of Diamond",15,R.drawable.two_of_diamonds);
        cards.add(card1);
        card1=new Card("3 of Diamond",16,R.drawable.three_of_diamonds);
        cards.add(card1);
        card1=new Card("4 of Diamond",17,R.drawable.four_of_diamonds);
        cards.add(card1);
        card1=new Card("5 of Diamond",18,R.drawable.five_of_diamonds);
        cards.add(card1);
        card1=new Card("6 of Diamond",19,R.drawable.six_of_diamonds);
        cards.add(card1);
        card1=new Card("7 of Diamond",20,R.drawable.seven_of_diamonds);
        cards.add(card1);
        card1=new Card("8 of Diamond",21,R.drawable.eight_of_diamonds);
        cards.add(card1);
        card1=new Card("9 of Diamond",22,R.drawable.nine_of_diamonds);
        cards.add(card1);
        card1=new Card("10 of Diamond",23,R.drawable.ten_of_diamonds);
        cards.add(card1);
        card1=new Card("Jack of Diamond",24,R.drawable.jack_of_diamonds);
        cards.add(card1);
        card1=new Card("Queen of Diamond",25,R.drawable.queen_of_diamonds);
        cards.add(card1);
        card1=new Card("King of Diamond",26,R.drawable.king_of_diamonds);
        cards.add(card1);
        card1=new Card("Ace of Hearts",27,R.drawable.ace_of_hearts);
        cards.add(card1);
        card1=new Card("2 of Hearts",28,R.drawable.two_of_hearts);
        cards.add(card1);
        card1=new Card("3 of Hearts",29,R.drawable.three_of_hearts);
        cards.add(card1);
        card1=new Card("4 of Hearts",30,R.drawable.four_of_hearts);
        cards.add(card1);
        card1=new Card("5 of Hearts",31,R.drawable.five_of_hearts);
        cards.add(card1);
        card1=new Card("6 of Hearts",32,R.drawable.six_of_hearts);
        cards.add(card1);
        card1=new Card("7 of Hearts",33,R.drawable.seven_of_hearts);
        cards.add(card1);
        card1=new Card("8 of Hearts",34,R.drawable.eight_of_hearts);
        cards.add(card1);
        card1=new Card("9 of Hearts",35,R.drawable.nine_of_hearts);
        cards.add(card1);
        card1=new Card("10 of Hearts",36,R.drawable.ten_of_hearts);
        cards.add(card1);
        card1=new Card("Jack of Hearts",37,R.drawable.jack_of_hearts);
        cards.add(card1);
        card1=new Card("Queen of Hearts",38,R.drawable.queen_of_hearts);
        cards.add(card1);
        card1=new Card("King of Hearts",39,R.drawable.king_of_hearts);
        cards.add(card1);
        card1=new Card("Ace of Spades",40,R.drawable.ace_of_spades);
        cards.add(card1);
        card1=new Card("2 of Spades",41,R.drawable.two_of_spades);
        cards.add(card1);
        card1=new Card("3 of Spades",42,R.drawable.three_of_spades);
        cards.add(card1);
        card1=new Card("4 of Spades",43,R.drawable.four_of_spades);
        cards.add(card1);
        card1=new Card("5 of Spades",44,R.drawable.five_of_spades);
        cards.add(card1);
        card1=new Card("6 of Spades",45,R.drawable.six_of_spades);
        cards.add(card1);
        card1=new Card("7 of Spades",46,R.drawable.seven_of_spades);
        cards.add(card1);
        card1=new Card("8 of Spades",47,R.drawable.eight_of_spades);
        cards.add(card1);
        card1=new Card("9 of Spades",48,R.drawable.nine_of_spades);
        cards.add(card1);
        card1=new Card("10 of Spades",49,R.drawable.ten_of_spades);
        cards.add(card1);
        card1=new Card("Jack of Spades",50,R.drawable.jack_of_spades);
        cards.add(card1);
        card1=new Card("Queen of Spades",41,R.drawable.queen_of_spades);
        cards.add(card1);
        card1=new Card("King of Spades",41,R.drawable.king_of_spades);
        cards.add(card1);

        for (int i=1; i<=21; i++)
        {
            int numbers=(int)(Math.random()*cards.size());
            p1.add(cards.get(numbers));
            int numb=(int)(Math.random()*cards.size());
            p2.add(cards.get(numb));
        }
        final ArrayList<Card> p1de=p1;
        final ArrayList<Card> p2de=p2;
        p1nam.setText(p1de.get(count).returnCardName());

            buton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    player1card.setImageResource(p1de.get(count).returnPictID());
                    player1card.setScaleX(0.5f);
                    player1card.setScaleY(0.5f);
                    player2card.setImageResource(p2de.get(count).returnPictID());
                    player2card.setScaleX(0.5f);
                    player2card.setScaleY(0.5f);
                    buton.setText("Continue to Workout!");

                }
            });







    }
 public class Card
    {
        int number;
        String name;
        int idnum;
        public Card(String str,int num, int id) {
           this.number=num;
            this.name=str;
            this.idnum=id;
        }
        public int returnPictID()
        {
            return idnum;
        }
        public int returnNumVal()
        {
            return number;
        }
        public String returnCardName()
        {
            return name;
        }
    }


}
