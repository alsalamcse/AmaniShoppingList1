package project.amani.amanishoppinglist1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import static project.amani.amanishoppinglist1.R.*;

public class AddItem extends AppCompatActivity {
    private EditText ETname;
    private EditText ETamount;
    private EditText ETunits;
    private EditText ETprice;
    private Button BTNSave;
    private ImageView iBTNimage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(.Amanishoppinglist.R.layout.activity_add_item);
        ETname = (EditText) findViewById(id.ETname);
        ETamount = (EditText) findViewById(id.ETamount);
        ETunits = (EditText) findViewById(id.ETunits);
        ETprice = (EditText) findViewById(id.ETprice);
        BTNSave = (Button) findViewById(id.BTNSave);
        iBTNimage = (ImageView) findViewById(id.iBTNimage);

        BTNSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dataHandler();
            }
        });
    }
    public void dataHandler(){
        //1. get data from the feilds
        String name = ETname.getText().toString();
        String stamount = ETamount.getText().toString();
        String Units = ETunits.getText().toString();
        String stprice = ETprice.getText().toString();
        //2. todo vlaidate feilds input
        //isOk=true;...

        //3. data manipulation
        double amount= Double.parseDouble(stamount);
        double price=Double.parseDouble(stprice);

        //4. building data object
       // Product p=new Product();
       // p.setName(stName);
       // p.setAmount(amount);
        //p.setPrice(price);
       // p.setCompleted(false);

        //5. to get user email... user info
      //  FirebaseAuth auth=FirebaseAuth.getInstance();
        //FirebaseUser user=auth.getCurrentUser();
       // String email=user.getEmail();
       // email=email.replace('.','*');

        //6. building data reference = data path = data address
      //  DatabaseReference reference;
        //todo לקבלת קישור למסד הנתונים שלנו
        //todo  קישור הינו לשורש של המסד הנתונים
       // reference= FirebaseDatabase.getInstance().getReference();
        //7. saving data on the firebase database
       // reference.child(email).child("mylist").push().setValue(p)
             //   .addOnCompleteListener(this, new OnCompleteListener<Void>() {
                           // @Override
                         //   public void onComplete(@NonNull Task<Void> task) {
                         //       if (task.isSuccessful())
                                {
                             //       Toast.makeText(AddItem.this, "Add Product Succeful", Toast.LENGTH_SHORT).show();
                                }
                             //    else {
                            ///       Toast.makeText(AddItem.this, "Add Product faild", Toast.LENGTH_SHORT).show();
                                }
                            }
                        }
             //   );



        //// TODO: 20/11/2017 testing
        // reference.child("list").setValue(stName);