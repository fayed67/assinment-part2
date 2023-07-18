public class TotalAccountBalance {
    public void balance(){



        int initial=1000;

        int interest=((1000/100)*5);

        for(int i=1;i<=3;i++){

            initial+=interest;
            System.out.println(initial);
        }



    }
}
