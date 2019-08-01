public class MainActivity extends AppCompatActivity {
    ListView simpleList;
    String fruits[]={"APPLE","MANGO","PINEAPPLE","FIG","AVACADO","BANANA","STRAWBERRY","GRAPES"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_main);
        simpleList=findViewById (R.id.simpleListView);

        ArrayAdapter<String> arrayAdapter =new ArrayAdapter<> (this,R.layout.list,R.id.textView,fruits);
        simpleList.setAdapter (arrayAdapter);

    }
}
