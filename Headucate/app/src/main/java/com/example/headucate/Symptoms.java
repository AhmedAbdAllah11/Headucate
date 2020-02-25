package com.example.headucate;

import android.app.AlertDialog;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

public class Symptoms extends AppCompatActivity {
    JSONObject symptoms, symptoms2, symptoms3, symptoms4, symptoms5, symptoms6, symptoms7;
    JSONObject symptoms8, symptoms9, symptoms10, symptoms11, symptoms12, symptoms13, symptoms14;
    JSONObject symptoms15, symptoms16, symptoms17, symptoms18, symptoms19, symptoms20, symptoms21;
    JSONObject symptoms22, symptoms23, symptoms24, symptoms25, symptoms26, symptoms27, symptoms28;
    JSONObject symptoms29, symptoms30, symptoms31, symptoms32, symptoms33, symptoms34;

    JSONObject parent;
    CheckBox ch_715, ch_228, ch_319, ch_492, ch_1483, ch_119, ch_331, ch_156, ch_371, ch_650, ch_1622, ch_1115, ch_1, ch_177, ch_1462, ch_762, ch_54, ch_1190, ch_50, ch_102, ch_309, ch_208, ch_247, ch_370, ch_1616, ch_1860, ch_611, ch_967, ch_120, ch_542, ch_305, ch_226, ch_285;
    RadioGroup radioGroup;
    EditText editText;
    String res = "", prob = "";
    double prob2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.symptoms );
        setTitle( "الأعراض" );

        radioGroup = findViewById( R.id.rg );
        editText = findViewById( R.id.ed );

        parent = new JSONObject();

        radioGroup.setOnCheckedChangeListener( new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int id) {
                switch (id) {
                    case R.id.male:
                        try {
                            parent.put( "sex", "male" );
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                        break;
                    case R.id.female:
                        try {
                            parent.put( "sex", "female" );
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                        break;

                }
            }
        } );


        ch_715 = findViewById( R.id.ats );
        ch_228 = findViewById( R.id.asnan );
        ch_319 = findViewById( R.id.noom );
        ch_492 = findViewById( R.id.e7mrar_3yn );
        ch_1483 = findViewById( R.id.alm_rkba );
        ch_119 = findViewById( R.id.khmoul );
        ch_331 = findViewById( R.id.e7tkan_anf );
        ch_156 = findViewById( R.id.khthyan );
        ch_371 = findViewById( R.id.erhaq );
        ch_650 = findViewById( R.id.d3f_3dlat );
        ch_1622 = findViewById( R.id.alm_smana );
        ch_1115 = findViewById( R.id.tskt_43r );
        ch_1 = findViewById( R.id.kr7a_fm );
        ch_177 = findViewById( R.id.twrm_5d );
        ch_1462 = findViewById( R.id.dyq_tnfs );
        ch_762 = findViewById( R.id.tf7_gldy );
        ch_54 = findViewById( R.id.alm_3yn );
        ch_1190 = findViewById( R.id.alm_zhr );
        ch_50 = findViewById( R.id.alm_sdr );
        ch_102 = findViewById( R.id.s3al );
        ch_309 = findViewById( R.id.entfa5 );
        ch_208 = findViewById( R.id.d3f_sm3 );
        ch_247 = findViewById( R.id.gfaf_fm );
        ch_370 = findViewById( R.id.do5a );
        ch_1616 = findViewById( R.id.q4ra );
        ch_1860 = findViewById( R.id.alm_btn );
        ch_611 = findViewById( R.id.bol_dakn );
        ch_967 = findViewById( R.id.en5fad_bsr );
        ch_120 = findViewById( R.id.qlq );
        ch_542 = findViewById( R.id.b4ra_gafah );
        ch_305 = findViewById( R.id.qi2 );
        ch_285 = findViewById( R.id.wzn_ );
        ch_226 = findViewById( R.id.wzn_zyada );

        ch_715.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                symptoms = new JSONObject();
                try {
                    symptoms.put( "id", "s_715" );
                    symptoms.put( "choice_id", "present" );
                } catch (JSONException e) {
                    e.printStackTrace();
                }

            }
        } );

        ch_228.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                symptoms2 = new JSONObject();
                try {
                    symptoms2.put( "id", "s_551" );
                    symptoms2.put( "choice_id", "present" );
                } catch (JSONException e) {
                    e.printStackTrace();
                }

            }
        } );

        ch_119.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                symptoms34 = new JSONObject();
                try {
                    symptoms34.put( "id", "s_119" );
                    symptoms34.put( "choice_id", "present" );
                } catch (JSONException e) {
                    e.printStackTrace();
                }

            }
        } );

        ch_319.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                symptoms3 = new JSONObject();
                try {
                    symptoms3.put( "id", "s_319" );
                    symptoms3.put( "choice_id", "present" );
                } catch (JSONException e) {
                    e.printStackTrace();
                }

            }
        } );

        ch_319.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                symptoms4 = new JSONObject();
                try {
                    symptoms4.put( "id", "s_492" );
                    symptoms4.put( "choice_id", "present" );
                } catch (JSONException e) {
                    e.printStackTrace();
                }

            }
        } );

        ch_1483.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                symptoms5 = new JSONObject();
                try {
                    symptoms5.put( "id", "s_1483" );
                    symptoms5.put( "choice_id", "present" );
                } catch (JSONException e) {
                    e.printStackTrace();
                }

            }
        } );

        ch_331.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                symptoms7 = new JSONObject();
                try {
                    symptoms7.put( "id", "s_331" );
                    symptoms7.put( "choice_id", "present" );
                } catch (JSONException e) {
                    e.printStackTrace();
                }

            }
        } );

        ch_228.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                symptoms6 = new JSONObject();
                try {
                    symptoms6.put( "id", "s_228" );
                    symptoms6.put( "choice_id", "present" );
                } catch (JSONException e) {
                    e.printStackTrace();
                }

            }
        } );

        ch_156.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                symptoms8 = new JSONObject();
                try {
                    symptoms8.put( "id", "s_156" );
                    symptoms8.put( "choice_id", "present" );
                } catch (JSONException e) {
                    e.printStackTrace();
                }

            }
        } );

        ch_371.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                symptoms9 = new JSONObject();
                try {
                    symptoms9.put( "id", "s_371" );
                    symptoms9.put( "choice_id", "present" );
                } catch (JSONException e) {
                    e.printStackTrace();
                }

            }
        } );

        ch_650.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                symptoms10 = new JSONObject();
                try {
                    symptoms10.put( "id", "s_650" );
                    symptoms10.put( "choice_id", "present" );
                } catch (JSONException e) {
                    e.printStackTrace();
                }

            }
        } );

        ch_1622.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                symptoms11 = new JSONObject();
                try {
                    symptoms11.put( "id", "s_1622" );
                    symptoms11.put( "choice_id", "present" );
                } catch (JSONException e) {
                    e.printStackTrace();
                }

            }
        } );

        ch_1115.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                symptoms12 = new JSONObject();
                try {
                    symptoms12.put( "id", "s_1115" );
                    symptoms12.put( "choice_id", "present" );
                } catch (JSONException e) {
                    e.printStackTrace();
                }

            }
        } );

        ch_1.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                symptoms13 = new JSONObject();
                try {
                    symptoms13.put( "id", "s_1" );
                    symptoms13.put( "choice_id", "present" );
                } catch (JSONException e) {
                    e.printStackTrace();
                }

            }
        } );

        ch_177.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                symptoms14 = new JSONObject();
                try {
                    symptoms14.put( "id", "s_177" );
                    symptoms14.put( "choice_id", "present" );
                } catch (JSONException e) {
                    e.printStackTrace();
                }

            }
        } );

        ch_1462.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                symptoms15 = new JSONObject();
                try {
                    symptoms15.put( "id", "s_1462" );
                    symptoms15.put( "choice_id", "present" );
                } catch (JSONException e) {
                    e.printStackTrace();
                }

            }
        } );

        ch_762.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                symptoms16 = new JSONObject();
                try {
                    symptoms16.put( "id", "s_762" );
                    symptoms16.put( "choice_id", "present" );
                } catch (JSONException e) {
                    e.printStackTrace();
                }

            }
        } );

        ch_54.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                symptoms17 = new JSONObject();
                try {
                    symptoms17.put( "id", "s_54" );
                    symptoms17.put( "choice_id", "present" );
                } catch (JSONException e) {
                    e.printStackTrace();
                }

            }
        } );

        ch_1190.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                symptoms18 = new JSONObject();
                try {
                    symptoms18.put( "id", "s_1190" );
                    symptoms18.put( "choice_id", "present" );
                } catch (JSONException e) {
                    e.printStackTrace();
                }

            }
        } );

        ch_50.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                symptoms19 = new JSONObject();
                try {
                    symptoms19.put( "id", "s_50" );
                    symptoms19.put( "choice_id", "present" );
                } catch (JSONException e) {
                    e.printStackTrace();
                }

            }
        } );

        ch_102.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                symptoms20 = new JSONObject();
                try {
                    symptoms20.put( "id", "s_102" );
                    symptoms20.put( "choice_id", "present" );
                } catch (JSONException e) {
                    e.printStackTrace();
                }

            }
        } );

        ch_309.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                symptoms21 = new JSONObject();
                try {
                    symptoms21.put( "id", "s_309" );
                    symptoms21.put( "choice_id", "present" );
                } catch (JSONException e) {
                    e.printStackTrace();
                }

            }
        } );

        ch_208.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                symptoms22 = new JSONObject();
                try {
                    symptoms22.put( "id", "s_208" );
                    symptoms22.put( "choice_id", "present" );
                } catch (JSONException e) {
                    e.printStackTrace();
                }

            }
        } );

        ch_247.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                symptoms23 = new JSONObject();
                try {
                    symptoms23.put( "id", "s_247" );
                    symptoms23.put( "choice_id", "present" );
                } catch (JSONException e) {
                    e.printStackTrace();
                }

            }
        } );

        ch_370.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                symptoms24 = new JSONObject();
                try {
                    symptoms24.put( "id", "s_370" );
                    symptoms24.put( "choice_id", "present" );
                } catch (JSONException e) {
                    e.printStackTrace();
                }

            }
        } );

        ch_1616.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                symptoms25 = new JSONObject();
                try {
                    symptoms25.put( "id", "s_1616" );
                    symptoms25.put( "choice_id", "present" );
                } catch (JSONException e) {
                    e.printStackTrace();
                }

            }
        } );

        ch_1860.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                symptoms26 = new JSONObject();
                try {
                    symptoms26.put( "id", "s_1860" );
                    symptoms26.put( "choice_id", "present" );
                } catch (JSONException e) {
                    e.printStackTrace();
                }

            }
        } );

        ch_611.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                symptoms27 = new JSONObject();
                try {
                    symptoms27.put( "id", "s_611" );
                    symptoms27.put( "choice_id", "present" );
                } catch (JSONException e) {
                    e.printStackTrace();
                }

            }
        } );

        ch_967.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                symptoms28 = new JSONObject();
                try {
                    symptoms28.put( "id", "s_967" );
                    symptoms28.put( "choice_id", "present" );
                } catch (JSONException e) {
                    e.printStackTrace();
                }

            }
        } );
        ch_120.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                symptoms29 = new JSONObject();
                try {
                    symptoms29.put( "id", "s_120" );
                    symptoms29.put( "choice_id", "present" );
                } catch (JSONException e) {
                    e.printStackTrace();
                }

            }
        } );
        ch_542.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                symptoms30 = new JSONObject();
                try {
                    symptoms30.put( "id", "s_542" );
                    symptoms30.put( "choice_id", "present" );
                } catch (JSONException e) {
                    e.printStackTrace();
                }

            }
        } );

        ch_305.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                symptoms31 = new JSONObject();
                try {
                    symptoms31.put( "id", "s_305" );
                    symptoms31.put( "choice_id", "present" );
                } catch (JSONException e) {
                    e.printStackTrace();
                }

            }
        } );

        ch_285.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                symptoms32 = new JSONObject();
                try {
                    symptoms32.put( "id", "s_285" );
                    symptoms32.put( "choice_id", "present" );
                } catch (JSONException e) {
                    e.printStackTrace();
                }

            }
        } );

        ch_226.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                symptoms33 = new JSONObject();
                try {
                    symptoms33.put( "id", "s_226" );
                    symptoms33.put( "choice_id", "present" );
                } catch (JSONException e) {
                    e.printStackTrace();
                }

            }
        } );


    }

    public void btnClicked(View view) {
        String ageString = editText.getText().toString();
        int age = Integer.parseInt( ageString );
        try {

            parent.put( "age", age );
        } catch (JSONException e) {
            e.printStackTrace();
        }
        JSONArray evidence = new JSONArray();

        if (ch_715.isChecked())
            evidence.put( symptoms );
        if (ch_228.isChecked())
            evidence.put( symptoms2 );
        if (ch_319.isChecked())
            evidence.put( symptoms3 );
        if (ch_492.isChecked())
            evidence.put( symptoms4 );
        if (ch_1483.isChecked())
            evidence.put( symptoms5 );
        if (ch_119.isChecked())
            evidence.put( symptoms34 );
        if (ch_331.isChecked())
            evidence.put( symptoms7 );
        if (ch_156.isChecked())
            evidence.put( symptoms8 );
        if (ch_371.isChecked())
            evidence.put( symptoms9 );
        if (ch_650.isChecked())
            evidence.put( symptoms10 );
        if (ch_1622.isChecked())
            evidence.put( symptoms11 );
        if (ch_1115.isChecked())
            evidence.put( symptoms12 );
        if (ch_1.isChecked())
            evidence.put( symptoms13 );
        if (ch_177.isChecked())
            evidence.put( symptoms14 );
        if (ch_1462.isChecked())
            evidence.put( symptoms15 );
        if (ch_762.isChecked())
            evidence.put( symptoms16 );
        if (ch_54.isChecked())
            evidence.put( symptoms17 );
        if (ch_1190.isChecked())
            evidence.put( symptoms18 );
        if (ch_50.isChecked())
            evidence.put( symptoms19 );
        if (ch_102.isChecked())
            evidence.put( symptoms20 );
        if (ch_309.isChecked())
            evidence.put( symptoms21 );
        if (ch_208.isChecked())
            evidence.put( symptoms22 );
        if (ch_247.isChecked())
            evidence.put( symptoms23 );
        if (ch_370.isChecked())
            evidence.put( symptoms24 );
        if (ch_1616.isChecked())
            evidence.put( symptoms25 );
        if (ch_1860.isChecked())
            evidence.put( symptoms26 );
        if (ch_611.isChecked())
            evidence.put( symptoms27 );
        if (ch_967.isChecked())
            evidence.put( symptoms28 );
        if (ch_120.isChecked())
            evidence.put( symptoms29 );
        if (ch_542.isChecked())
            evidence.put( symptoms30 );
        if (ch_305.isChecked())
            evidence.put( symptoms31 );
        if (ch_285.isChecked())
            evidence.put( symptoms32 );
        if (ch_226.isChecked())
            evidence.put( symptoms33 );

        try {
            parent.put( "evidence", evidence );
        } catch (JSONException e) {
            e.printStackTrace();
        }
        Log.d( "json", "JSON to be sent" + parent );


        RequestQueue queue = Volley.newRequestQueue( this );
        String url = "https://api.infermedica.com/v2/diagnosis";

        JsonObjectRequest stringRequest = new JsonObjectRequest( Request.Method.POST, url, parent,
                new Response.Listener <JSONObject>() {
                    @Override
                    public void onResponse(JSONObject response) {
                        Log.d( "json", "response " + response );
                        try {
                            JSONArray conditions = response.getJSONArray( "conditions" );
                            Log.d( "json", "condition length " + conditions.length() );
                            for (int k = 0; k < conditions.length(); k++) {
                                Log.d( "json", "values of loop: " + k );

                                JSONObject result = conditions.getJSONObject( k );
                                String common = result.getString( "common_name" );
                                //String probability = result.getString( "probability" );
                                double probability = result.getDouble( "probability" );
                                res += "You may have " + common + " with probability " + probability + "\n";
                                //prob += probability;
                                //prob2 += probability;
                                Log.d( "json", "result is: " + res );
                            }

                            openDialogue();

                        } catch (JSONException e) {
                            Log.d( "json", "No loop, error is " + e );
                            e.printStackTrace();
                        }
                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Log.d( "json", "no result: " );
                error.printStackTrace();
            }
        } ) {

            @Override
            public Map <String, String> getHeaders() {
                Map <String, String> postMap = new HashMap <>();
                postMap.put( "App-Id", "47d516af" );
                postMap.put( "App-Key", "4b29b89a896ebf728c194e44caf0137d" );
                return postMap;
            }
        };

// Add the request to the RequestQueue.
        queue.add( stringRequest );

    }


    private void openDialogue() {

        AlertDialog.Builder builder;
        builder = new AlertDialog.Builder( this );
        //builder.setMessage( "You may have " + res + "\n probability is " + (prob2 * 100) + "%\n" );
        builder.setMessage( res );
        builder.setCancelable( true );
        builder.setOnDismissListener( new DialogInterface.OnDismissListener() {
            @Override
            public void onDismiss(DialogInterface dialog) {
                    res = "";
            }
        } );


        builder.setPositiveButton( "ترجمة", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int id) {
                try {
                    Intent intent = new Intent();
                    intent.setAction( Intent.ACTION_SEND );
                    intent.putExtra( Intent.EXTRA_TEXT, res );
                    intent.putExtra( "key_text_input", "hello" );
                    intent.putExtra( "key_text_output", "" );
                    intent.putExtra( "key_language_from", "en" );
                    intent.putExtra( "key_language_to", "mal" );
                    intent.putExtra( "key_suggest_translation", "" );
                    intent.putExtra( "key_from_floating_window", false );
                    intent.setComponent( new ComponentName(
                            "com.google.android.apps.translate",
                            //Change is here
                            //"com.google.android.apps.translate.HomeActivity"));
                            "com.google.android.apps.translate.TranslateActivity" ) );
                    startActivity( intent );
                } catch (ActivityNotFoundException e) {
                    Toast.makeText( getApplication(), "لا يوجد لديك تطبيق جوجل ترجمة", Toast.LENGTH_SHORT ).show();
                }

            }
        } );

        builder.setNegativeButton( "مشاركه", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int id) {
                Intent myIntent = new Intent( Intent.ACTION_SEND );
                myIntent.setType( "text/plain" );
                String sharebody = res; // title text
                String sharesub = "your subject here"; //the details of sharing contemt
                myIntent.putExtra( Intent.EXTRA_SUBJECT, sharesub );
                myIntent.putExtra( Intent.EXTRA_TEXT, sharebody );
                startActivity( Intent.createChooser( myIntent, "share using" ) );
                //do things
            }
        } );

        AlertDialog alert = builder.create();
        alert.show();

    }

    @Override
    protected void onResume() {
        super.onResume();
        res = "";
        prob = "";
    }
}