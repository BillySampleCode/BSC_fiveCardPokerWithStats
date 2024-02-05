//Creator: BillySampleCode
//Project Name: BSC_fiveCardPokerWithStats

import java.util.Arrays;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.InputMismatchException;

public class BSC_fiveCardPokerWithStats {
    
    //CF&IF
    final static public String cardRankOptions[] = {"2","3","4","5","6","7",
                                "8","9","10","Jack", "Queen", "King", "Ace"};
    final static public String cardSuitOptions[] = {"Clubs","Diamonds",
                                "Hearts","Spades"};
    String cardRank;
    String cardSuit;
    int cardCount;
    String cardName;
    
    //Restrict ArrayList to ClassType.
    static ArrayList<BSC_fiveCardPokerWithStats> deckRandomArrayList = 
            new ArrayList<>();
    int deckLength = deckRandomArrayList.size();
    static boolean deckStatus = false; //To check if deck is full or not.
    static int cardCounter1 = 1; //To count the Nth random card.
    static boolean aCardStatus = false; //To check if card exists in deck.
    
    //For collecting stats.
    static int counter2OfClubs = 0;
    static int counter2OfDiamonds = 0;
    static int counter2OfHearts = 0;
    static int counter2OfSpades = 0;
    
    static int counter3OfClubs = 0;
    static int counter3OfDiamonds = 0;
    static int counter3OfHearts = 0;
    static int counter3OfSpades = 0;
    
    static int counter4OfClubs = 0;
    static int counter4OfDiamonds = 0;
    static int counter4OfHearts = 0;
    static int counter4OfSpades = 0;
    
    static int counter5OfClubs = 0;
    static int counter5OfDiamonds = 0;
    static int counter5OfHearts = 0;
    static int counter5OfSpades = 0;
    
    static int counter6OfClubs = 0;
    static int counter6OfDiamonds = 0;
    static int counter6OfHearts = 0;
    static int counter6OfSpades = 0;
    
    static int counter7OfClubs = 0;
    static int counter7OfDiamonds = 0;
    static int counter7OfHearts = 0;
    static int counter7OfSpades = 0;
    
    static int counter8OfClubs = 0;
    static int counter8OfDiamonds = 0;
    static int counter8OfHearts = 0;
    static int counter8OfSpades = 0;
    
    static int counter9OfClubs = 0;
    static int counter9OfDiamonds = 0;
    static int counter9OfHearts = 0;
    static int counter9OfSpades = 0;
    
    static int counter10OfClubs = 0;
    static int counter10OfDiamonds = 0;
    static int counter10OfHearts = 0;
    static int counter10OfSpades = 0;
    
    static int counterJackOfClubs = 0;
    static int counterJackOfDiamonds = 0;
    static int counterJackOfHearts = 0;
    static int counterJackOfSpades = 0;
    
    static int counterQueenOfClubs = 0;
    static int counterQueenOfDiamonds = 0;
    static int counterQueenOfHearts = 0;
    static int counterQueenOfSpades = 0;
    
    static int counterKingOfClubs = 0;
    static int counterKingOfDiamonds = 0;
    static int counterKingOfHearts = 0;
    static int counterKingOfSpades = 0;
    
    static int counterAceOfClubs = 0;
    static int counterAceOfDiamonds = 0;
    static int counterAceOfHearts = 0;
    static int counterAceOfSpades = 0;            
    
    //CC: PCCDNA
    public BSC_fiveCardPokerWithStats(){
    };
    //CC: PCCWA ... Constructor for a card object.
    public BSC_fiveCardPokerWithStats(String rankInput, String suitInput,
                        int cardCounter1){
        this.cardRank = rankInput;
        this.cardSuit = suitInput;
        this.cardCount = cardCounter1;
        this.cardName = (this.cardRank + " of " + this.cardSuit);
    };  
    
    //All others:
    public static BSC_fiveCardPokerWithStats sfmCreateRandomCard(
                    String inputRank, String inputSuit, int inputCounter){
        BSC_fiveCardPokerWithStats newCard = 
                new BSC_fiveCardPokerWithStats(
                    inputRank, 
                    inputSuit,
                    inputCounter);
        return newCard;
    };
    
    public static boolean checkDeckArrayListSize(
                    ArrayList<BSC_fiveCardPokerWithStats> inputDeck){
        ArrayList<BSC_fiveCardPokerWithStats> aDeck = inputDeck;
    
        if (aDeck.size()== 52){
            deckStatus = true;
        }else if(aDeck.size()!= 52){
            deckStatus = false;
        }
        return deckStatus;
    };
    
    public static BSC_fiveCardPokerWithStats createRandomCard(){
        //Random: random.nextInt(inputIntExclusive)
        //...0inclusive to #exclusive.
        Random randomVar = new Random();
        int newRandom1 = randomVar.nextInt(cardRankOptions.length);
        int newRandom2 = randomVar.nextInt(cardSuitOptions.length);       
        String randomRank = cardRankOptions[newRandom1];
        String randomSuit = cardSuitOptions[newRandom2];
        //Use sfm here...
        BSC_fiveCardPokerWithStats cardObject =
                sfmCreateRandomCard(randomRank, randomSuit,
               cardCounter1);
        
        //SOPCheck: Show detail of random card created. 
        System.out.println("This is the Nth Random card generated: " 
                + cardCounter1);
        System.out.println("cardRank: " + cardObject.cardRank);
        System.out.println("cardSuit: " + cardObject.cardSuit);
        
        //cardCounter1 should increase after card creation and SOPCheck.
        cardCounter1++;
        return cardObject;
    };
    
    public static void statsTallyTheCards(
            BSC_fiveCardPokerWithStats inputCard){
    
        BSC_fiveCardPokerWithStats tallyThisCard = inputCard;

        //counter2OfClubs
        if(tallyThisCard.cardRank.equals("2")
            && tallyThisCard.cardSuit.equals("Clubs")){
            counter2OfClubs++;
        }
        //counter2OfDiamonds
        else if(tallyThisCard.cardRank.equals("2")
            && tallyThisCard.cardSuit.equals("Diamonds")){
            counter2OfDiamonds++;
        }
        //counter2OfHearts
        else if(tallyThisCard.cardRank.equals("2")
            && tallyThisCard.cardSuit.equals("Hearts")){
            counter2OfHearts++;
        }
        //counter2OfSpades
        else if(tallyThisCard.cardRank.equals("2")
            && tallyThisCard.cardSuit.equals("Spades")){
            counter2OfSpades++;
        }

        //counter3OfClubs
        else if(tallyThisCard.cardRank.equals("3")
        && tallyThisCard.cardSuit.equals("Clubs")){
        counter3OfClubs++;
        }
        //counter3OfDiamonds
        else if(tallyThisCard.cardRank.equals("3")
        && tallyThisCard.cardSuit.equals("Diamonds")){
        counter3OfDiamonds++;
        }
        //counter3OfHearts
        else if(tallyThisCard.cardRank.equals("3")
        && tallyThisCard.cardSuit.equals("Hearts")){
        counter3OfHearts++;
        }
        //counter3OfSpades
        else if(tallyThisCard.cardRank.equals("3")
        && tallyThisCard.cardSuit.equals("Spades")){
        counter3OfSpades++;
        }

        //counter4OfClubs
        else if(tallyThisCard.cardRank.equals("4")
        && tallyThisCard.cardSuit.equals("Clubs")){
        counter4OfClubs++;
        }
        //counter4OfDiamonds
        else if(tallyThisCard.cardRank.equals("4")
        && tallyThisCard.cardSuit.equals("Diamonds")){
        counter4OfDiamonds++;
        }
        //counter4OfHearts
        else if(tallyThisCard.cardRank.equals("4")
        && tallyThisCard.cardSuit.equals("Hearts")){
        counter4OfHearts++;
        }
        //counter4OfSpades
        else if(tallyThisCard.cardRank.equals("4")
        && tallyThisCard.cardSuit.equals("Spades")){
        counter4OfSpades++;
        }

        //counter5OfClubs
        else if(tallyThisCard.cardRank.equals("5")
        && tallyThisCard.cardSuit.equals("Clubs")){
        counter5OfClubs++;
        }
        //counter5OfDiamonds
        else if(tallyThisCard.cardRank.equals("5")
        && tallyThisCard.cardSuit.equals("Diamonds")){
        counter5OfDiamonds++;
        }
        //counter5OfHearts
        else if(tallyThisCard.cardRank.equals("5")
        && tallyThisCard.cardSuit.equals("Hearts")){
        counter5OfHearts++;
        }
        //counter5OfSpades
        else if(tallyThisCard.cardRank.equals("5")
        && tallyThisCard.cardSuit.equals("Spades")){
        counter5OfSpades++;
        }

        //counter6OfClubs
        else if(tallyThisCard.cardRank.equals("6")
        && tallyThisCard.cardSuit.equals("Clubs")){
        counter6OfClubs++;
        }
        //counter6OfDiamonds
        else if(tallyThisCard.cardRank.equals("6")
        && tallyThisCard.cardSuit.equals("Diamonds")){
        counter6OfDiamonds++;
        }
        //counter6OfHearts
        else if(tallyThisCard.cardRank.equals("6")
        && tallyThisCard.cardSuit.equals("Hearts")){
        counter6OfHearts++;
        }
        //counter6OfSpades
        else if(tallyThisCard.cardRank.equals("6")
        && tallyThisCard.cardSuit.equals("Spades")){
        counter6OfSpades++;
        }

        //counter7OfClubs
        else if(tallyThisCard.cardRank.equals("7")
        && tallyThisCard.cardSuit.equals("Clubs")){
        counter7OfClubs++;
        }
        //counter7OfDiamonds
        else if(tallyThisCard.cardRank.equals("7")
        && tallyThisCard.cardSuit.equals("Diamonds")){
        counter7OfDiamonds++;
        }
        //counter7OfHearts
        else if(tallyThisCard.cardRank.equals("7")
        && tallyThisCard.cardSuit.equals("Hearts")){
        counter7OfHearts++;
        }
        //counter7OfSpades
        else if(tallyThisCard.cardRank.equals("7")
        && tallyThisCard.cardSuit.equals("Spades")){
        counter7OfSpades++;
        }

        //counter8OfClubs
        else if(tallyThisCard.cardRank.equals("8")
        && tallyThisCard.cardSuit.equals("Clubs")){
        counter8OfClubs++;
        }
        //counter8OfDiamonds
        else if(tallyThisCard.cardRank.equals("8")
        && tallyThisCard.cardSuit.equals("Diamonds")){
        counter8OfDiamonds++;
        }
        //counter8OfHearts
        else if(tallyThisCard.cardRank.equals("8")
        && tallyThisCard.cardSuit.equals("Hearts")){
        counter8OfHearts++;
        }
        //counter8OfSpades
        else if(tallyThisCard.cardRank.equals("8")
        && tallyThisCard.cardSuit.equals("Spades")){
        counter8OfSpades++;
        }

        //counter9OfClubs
        else if(tallyThisCard.cardRank.equals("9")
        && tallyThisCard.cardSuit.equals("Clubs")){
        counter9OfClubs++;
        }
        //counter9OfDiamonds
        else if(tallyThisCard.cardRank.equals("9")
        && tallyThisCard.cardSuit.equals("Diamonds")){
        counter9OfDiamonds++;
        }
        //counter9OfHearts
        else if(tallyThisCard.cardRank.equals("9")
        && tallyThisCard.cardSuit.equals("Hearts")){
        counter9OfHearts++;
        }
        //counter9OfSpades
        else if(tallyThisCard.cardRank.equals("9")
        && tallyThisCard.cardSuit.equals("Spades")){
        counter9OfSpades++;
        }

        //counter10OfClubs
        else if(tallyThisCard.cardRank.equals("10")
        && tallyThisCard.cardSuit.equals("Clubs")){
        counter10OfClubs++;
        }
        //counter10OfDiamonds
        else if(tallyThisCard.cardRank.equals("10")
        && tallyThisCard.cardSuit.equals("Diamonds")){
        counter10OfDiamonds++;
        }
        //counter10OfHearts
        else if(tallyThisCard.cardRank.equals("10")
        && tallyThisCard.cardSuit.equals("Hearts")){
        counter10OfHearts++;
        }
        //counter10OfSpades
        else if(tallyThisCard.cardRank.equals("10")
        && tallyThisCard.cardSuit.equals("Spades")){
        counter10OfSpades++;
        }

        //counterJackOfClubs
        else if(tallyThisCard.cardRank.equals("Jack")
        && tallyThisCard.cardSuit.equals("Clubs")){
        counterJackOfClubs++;
        }
        //counterJackOfDiamonds
        else if(tallyThisCard.cardRank.equals("Jack")
        && tallyThisCard.cardSuit.equals("Diamonds")){
        counterJackOfDiamonds++;
        }
        //counterJackOfHearts
        else if(tallyThisCard.cardRank.equals("Jack")
        && tallyThisCard.cardSuit.equals("Hearts")){
        counterJackOfHearts++;
        }
        //counterJackOfSpades
        else if(tallyThisCard.cardRank.equals("Jack")
        && tallyThisCard.cardSuit.equals("Spades")){
        counterJackOfSpades++;
        }

        //counterQueenOfClubs
        else if(tallyThisCard.cardRank.equals("Queen")
        && tallyThisCard.cardSuit.equals("Clubs")){
        counterQueenOfClubs++;
        }
        //counterQueenOfDiamonds
        else if(tallyThisCard.cardRank.equals("Queen")
        && tallyThisCard.cardSuit.equals("Diamonds")){
        counterQueenOfDiamonds++;
        }
        //counterQueenOfHearts
        else if(tallyThisCard.cardRank.equals("Queen")
        && tallyThisCard.cardSuit.equals("Hearts")){
        counterQueenOfHearts++;
        }
        //counterQueenOfSpades
        else if(tallyThisCard.cardRank.equals("Queen")
        && tallyThisCard.cardSuit.equals("Spades")){
        counterQueenOfSpades++;
        }

        //counterKingOfClubs
        else if(tallyThisCard.cardRank.equals("King")
        && tallyThisCard.cardSuit.equals("Clubs")){
        counterKingOfClubs++;
        }
        //counterKingOfDiamonds
        else if(tallyThisCard.cardRank.equals("King")
        && tallyThisCard.cardSuit.equals("Diamonds")){
        counterKingOfDiamonds++;
        }
        //counterKingOfHearts
        else if(tallyThisCard.cardRank.equals("King")
        && tallyThisCard.cardSuit.equals("Hearts")){
        counterKingOfHearts++;
        }
        //counterKingOfSpades
        else if(tallyThisCard.cardRank.equals("King")
        && tallyThisCard.cardSuit.equals("Spades")){
        counterKingOfSpades++;
        }

        //counterAceOfClubs
        else if(tallyThisCard.cardRank.equals("Ace")
        && tallyThisCard.cardSuit.equals("Clubs")){
        counterAceOfClubs++;
        }
        //counterAceOfDiamonds
        else if(tallyThisCard.cardRank.equals("Ace")
        && tallyThisCard.cardSuit.equals("Diamonds")){
        counterAceOfDiamonds++;
        }
        //counterAceOfHearts
        else if(tallyThisCard.cardRank.equals("Ace")
        && tallyThisCard.cardSuit.equals("Hearts")){
        counterAceOfHearts++;
        }
        //counterAceOfSpades
        else if(tallyThisCard.cardRank.equals("Ace")
        && tallyThisCard.cardSuit.equals("Spades")){
        counterAceOfSpades++;
        }
    }    
    
    public static boolean checkForCard(BSC_fiveCardPokerWithStats inputCard){
        BSC_fiveCardPokerWithStats aCard = inputCard;
        int cardCounter2 = 0; //Tracks the number of repated cards.
        
        //Will run into problem if ArrayList is empty.
        if(deckRandomArrayList.size() == 0){
            aCardStatus = false;
        }else if(deckRandomArrayList.size() != 0){
            for(BSC_fiveCardPokerWithStats currentCard : deckRandomArrayList){
                if (aCard.cardRank.equals(currentCard.cardRank)
                    && aCard.cardSuit.equals(currentCard.cardSuit)){
                    cardCounter2++; //This counter should never be >1.
                }
            }
        }
        if(cardCounter2 > 0){
            aCardStatus = true;
            System.out.println("cardStatus: This is a repeat!");
            System.out.println("");
        }else{
            aCardStatus = false;
            System.out.println("cardStatus: This is not a repeat!");
            System.out.println("");
        }
        //Count the Nth random card here.
        return aCardStatus;
    };
    
    public static void sopTallyOfCards(){

        System.out.println("counter2OfClubs: " + counter2OfClubs);
        System.out.println("counter2OfDiamonds: " + counter2OfDiamonds);
        System.out.println("counter2OfHearts: " + counter2OfHearts);
        System.out.println("counter2OfSpades: " + counter2OfSpades);
        System.out.println("");
        
        System.out.println("counter3OfClubs: " + counter3OfClubs);
        System.out.println("counter3OfDiamonds: " + counter3OfDiamonds);
        System.out.println("counter3OfHearts: " + counter3OfHearts);
        System.out.println("counter3OfSpades: " + counter3OfSpades);
        System.out.println("");
        
        System.out.println("counter4OfClubs: " + counter4OfClubs);
        System.out.println("counter4OfDiamonds: " + counter4OfDiamonds);
        System.out.println("counter4OfHearts: " + counter4OfHearts);
        System.out.println("counter4OfSpades: " + counter4OfSpades);
        System.out.println("");
        
        System.out.println("counter5OfClubs: " + counter5OfClubs);
        System.out.println("counter5OfDiamonds: " + counter5OfDiamonds);
        System.out.println("counter5OfHearts: " + counter5OfHearts);
        System.out.println("counter5OfSpades: " + counter5OfSpades);
        System.out.println("");
        
        System.out.println("counter6OfClubs: " + counter6OfClubs);
        System.out.println("counter6OfDiamonds: " + counter6OfDiamonds);
        System.out.println("counter6OfHearts: " + counter6OfHearts);
        System.out.println("counter6OfSpades: " + counter6OfSpades);
        System.out.println("");
        
        System.out.println("counter7OfClubs: " + counter7OfClubs);
        System.out.println("counter7OfDiamonds: " + counter7OfDiamonds);
        System.out.println("counter7OfHearts: " + counter7OfHearts);
        System.out.println("counter7OfSpades: " + counter7OfSpades);
        System.out.println("");
        
        System.out.println("counter8OfClubs: " + counter8OfClubs);
        System.out.println("counter8OfDiamonds: " + counter8OfDiamonds);
        System.out.println("counter8OfHearts: " + counter8OfHearts);
        System.out.println("counter8OfSpades: " + counter8OfSpades);
        System.out.println("");
        
        System.out.println("counter9OfClubs: " + counter9OfClubs);
        System.out.println("counter9OfDiamonds: " + counter9OfDiamonds);
        System.out.println("counter9OfHearts: " + counter9OfHearts);
        System.out.println("counter9OfSpades: " + counter9OfSpades);
        System.out.println("");
        
        System.out.println("counter10OfClubs: " + counter10OfClubs);
        System.out.println("counter10OfDiamonds: " + counter10OfDiamonds);
        System.out.println("counter10OfHearts: " + counter10OfHearts);
        System.out.println("counter10OfSpades: " + counter10OfSpades);
        System.out.println("");
        
        System.out.println("counterJackOfClubs: " + counterJackOfClubs);
        System.out.println("counterJackOfDiamonds: " + counterJackOfDiamonds);
        System.out.println("counterJackOfHearts: " + counterJackOfHearts);
        System.out.println("counterJackOfSpades: " + counterJackOfSpades);
        System.out.println("");
        
        System.out.println("counterQueenOfClubs: " + counterQueenOfClubs);
        System.out.println("counterQueenOfDiamonds: " + counterQueenOfDiamonds);
        System.out.println("counterQueenOfHearts: " + counterQueenOfHearts);
        System.out.println("counterQueenOfSpades: " + counterQueenOfSpades);
        System.out.println("");
        
        System.out.println("counterKingOfClubs: " + counterKingOfClubs);
        System.out.println("counterKingOfDiamonds: " + counterKingOfDiamonds);
        System.out.println("counterKingOfHearts: " + counterKingOfHearts);
        System.out.println("counterKingOfSpades: " + counterKingOfSpades);
        System.out.println("");        
        
        System.out.println("counterAceOfClubs: " + counterAceOfClubs);
        System.out.println("counterAceOfDiamonds: " + counterAceOfDiamonds);
        System.out.println("counterAceOfHearts: " + counterAceOfHearts);
        System.out.println("counterAceOfSpades: " + counterAceOfSpades);
        System.out.println("");        
    };
    
    //Utilize @Override so values returned in ArrayList are not hashcodes.
    @Override
    public String toString(){
        return this.cardName;
    };
    
    //Ask For Scanner Input, to determine number of player hands!
    static int handsAtTable = 0;
    static boolean handsMaxLimit = true; //anchorLocal.
    
    public static void askForScannerInput(){
        int intCheck = 0; //anchorLocal.
        boolean inputStatus = false; //anchorLocal.
        
        do{
            Scanner scannerVar1 = new Scanner(System.in);
            System.out.println("Please input number of players: ");
            //Assume string, convert later.
            String input1 = scannerVar1.nextLine();
            try{
                //Parse a String into an Integer Wrapper Value.
                handsAtTable = Integer.parseInt(input1);
                inputStatus = true;
                    if (handsAtTable > 4){
                    System.out.println("Too many, max players 4, "
                            + "please re-input!");
                    inputStatus = false;
                    }else if(handsAtTable == 0){
                    System.out.println("Huh, you entered zero players! "
                            + "please re-input!"); 
                    inputStatus = false;        
                    }else if(handsAtTable == 1){
                    System.out.println("Thanks, we have " + handsAtTable 
                        + " player! - Why not invite a friend to join!");    
                    inputStatus = true;
                    }else{
                    System.out.println("Thanks, we have " + handsAtTable 
                        + " players!");    
                    inputStatus = true;
                    }
            }catch(NumberFormatException varException){
                System.out.println("You did not enter an integer!");
                inputStatus = false;
            }
        }while(inputStatus == false);
    }
    
    //Create sfm for creating a arrayListHand.
    public static ArrayList<BSC_fiveCardPokerWithStats> sfmCreateHand(){
        ArrayList<BSC_fiveCardPokerWithStats> aHand = new ArrayList();
        return aHand;
    };
    
    //Create a 2D ArrayList, an ArrayList filled with ArrayLists!
    static ArrayList<ArrayList<BSC_fiveCardPokerWithStats>> al2DHandCollector 
            = new ArrayList();
    
    //Consolidate the number of player hands created.
    public static void createHandsAtTableCollector(){
        int handCounter = 0; //anchorLocal.
        while (handCounter<handsAtTable){
            ArrayList<BSC_fiveCardPokerWithStats> newHand = sfmCreateHand();
            //Add each new hand at the Nth index of the arraylist collector.
            al2DHandCollector.add(handCounter,newHand);
            handCounter++;
        }
    };
    
    //Draw card from deck.
    public static BSC_fiveCardPokerWithStats drawRandomCard(){
        Random randomVar = new Random();
        int newRandom3 = randomVar.nextInt(deckRandomArrayList.size());
        BSC_fiveCardPokerWithStats addThisCardToHand = 
                deckRandomArrayList.get(newRandom3);
        return addThisCardToHand;
    };
    
    //Remove drawn card from existing deck.
    public static void removeDrawnRandomCard(
            BSC_fiveCardPokerWithStats inputCard){
        deckRandomArrayList.remove(inputCard);
    };
    
    //A single round of drawing cards.
    static int cardCounter3 = 0; //anchorLocal for each round of card dealt.
    
    public static void aRoundOfDrawingCards(){
        for(ArrayList<BSC_fiveCardPokerWithStats> 
                handArrayList: al2DHandCollector ){
            BSC_fiveCardPokerWithStats drawnCard = drawRandomCard();
            handArrayList.add(cardCounter3, drawnCard);
            removeDrawnRandomCard(drawnCard);
        }
        //Increase counter for next index in each hand.
        cardCounter3++;
    };
    
    //Set the number of cards per hand.
    static int cardsPerHand = 5;
    //A multiple round of drawing cards to build a hand.
    public static void buildTheHands(){
        int nThRound = 0;
        while(nThRound < cardsPerHand){
            aRoundOfDrawingCards();
            nThRound++;
        }
    };
    
    //SOP Checks.
    public static void sopCheck1(){
        System.out.println("Hello, world!");
        System.out.println("Welcome to BillySampleCode's "
                + "Five Card Poker Game!");
    }
    
    public static void sopCheck2(){
        System.out.println("Cards are dealt! Number of cards remaining in "
                + "deck: " + deckRandomArrayList.size());            
    };
    
    public static void sopCheck3(){
        int cardCounter4 = 0; //anchorLocal.
        for (ArrayList<BSC_fiveCardPokerWithStats> 
                handArrayList: al2DHandCollector){
            System.out.println("Player #" + (cardCounter4+1) + "'s cards are:"
                    + handArrayList);
            cardCounter4++;
        }
    }
    public static void sopCheck4(){
        System.out.println("Please compare for strongest hand! ");
        System.out.println("Thanks for playing!");
        System.out.println("Hope you had plenty of fun!");
    }
    
    static boolean psvmVar1;
    public static void main (String[] args){
        //Building a random deck.
        //Check if deck is full.
        psvmVar1 = checkDeckArrayListSize(deckRandomArrayList);
        
        //If full, do nothing.
        if (psvmVar1 == true){
            return;
        //If not full, then Loop-While, until deck is full.
        }else if (psvmVar1 == false){
            labelPoint1:
            while(deckRandomArrayList.size()<52){
                //Create a random card. 
                BSC_fiveCardPokerWithStats psvmVar2 = createRandomCard();
                //Stats: Tally the cards created.
                statsTallyTheCards(psvmVar2);
                //Check if random card exists in deck.
                boolean psvmVar3 = checkForCard(psvmVar2);
                //If in deck, jump back to create random card.
                if (psvmVar3 == true){
                    continue labelPoint1;
                }
                //If not in deck, then add random card to deck.
                deckRandomArrayList.add(psvmVar2);
            }
        }
        //Add SOPChecks.
        System.out.println("Print out deck, @Override toString(): ");
        System.out.println(deckRandomArrayList.toString());
        System.out.println("");
        System.out.println("Total Cards in Deck, prints : " 
                + deckRandomArrayList.size());
        System.out.println("");
        System.out.println("Stats: Tally Of Cards");
        sopTallyOfCards();

        System.out.println("\n");
        System.out.println("Start of Game:");
        System.out.println("");
        
        //Run the game.
        sopCheck1();
        askForScannerInput();
        createHandsAtTableCollector();
        buildTheHands();
        sopCheck2();
        sopCheck3();
        sopCheck4();
    };
};//End.