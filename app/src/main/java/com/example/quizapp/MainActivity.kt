/* The instruction in this program make to easy remind and readable
        ***************************************************
                ******************************
                    ********************
                         *********
                          9:20PM
                        Made By Saty
                          26/06/20
                Code Summary with instruction
 */
package com.example.quizapp

import android.annotation.SuppressLint
import android.graphics.Color
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n", "SimpleDateFormat")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Time start  declare

        val startMs = System.currentTimeMillis()

        //Main Function apply on submit button
        Submitbutton.setOnClickListener {
            val userName = userInput.text.toString()
            //Declare Score variable
            var score = 0
            //Check the question one using


            //Radio Group Question 1
            when {
                A_1_1.isChecked -> {
                    //Increase Score 1
                    score += 1
                    //Change Background
                    A_1_1.setBackgroundColor(Color.GREEN)
                }
                //Easy Condition to change color checked Radio button
                A_1_2.isChecked -> A_1_2.setBackgroundColor(Color.RED)
                A_1_3.isChecked -> A_1_3.setBackgroundColor(Color.RED)
                A_1_4.isChecked -> A_1_4.setBackgroundColor(Color.RED)
                A_1_5.isChecked -> A_1_5.setBackgroundColor(Color.RED)
                else -> Radio_Q1.setBackgroundColor(Color.RED)
            }
            //Radio Group Question 2
            when {
                A_2_5.isChecked -> {
                    //Increase Score 1
                    score += 1
                    //Change Background
                    A_2_5.setBackgroundColor(Color.GREEN)
                }
                //Easy Condition to change color checked Radio button
                A_2_2.isChecked -> A_2_2.setBackgroundColor(Color.RED)
                A_2_3.isChecked -> A_2_3.setBackgroundColor(Color.RED)
                A_2_4.isChecked -> A_2_4.setBackgroundColor(Color.RED)
                A_2_1.isChecked -> A_2_1.setBackgroundColor(Color.RED)
                else -> Radio_Q2.setBackgroundColor(Color.RED)
            }
            //Radio Group Question 3

            when {
                A_3_4.isChecked -> {
                    //Increase Score 1
                    score += 1
                    //Change Background
                    A_3_4.setBackgroundColor(Color.GREEN)
                }
                //Easy Condition to change color checked Radio button
                A_3_2.isChecked -> A_3_2.setBackgroundColor(Color.RED)
                A_3_3.isChecked -> A_3_3.setBackgroundColor(Color.RED)
                A_3_1.isChecked -> A_3_1.setBackgroundColor(Color.RED)
                A_3_5.isChecked -> A_3_5.setBackgroundColor(Color.RED)
                else -> Radio_Q3.setBackgroundColor(Color.RED)
            }

            //Radio Group Question 4

            when {
                A_4_5.isChecked -> {
                    //Increase Score 1
                    score += 1
                    //Change Background
                    A_4_5.setBackgroundColor(Color.GREEN)
                }
                //Easy Condition to change color checked Radio button
                A_4_2.isChecked -> A_4_2.setBackgroundColor(Color.RED)
                A_4_3.isChecked -> A_4_3.setBackgroundColor(Color.RED)
                A_4_4.isChecked -> A_4_4.setBackgroundColor(Color.RED)
                A_4_1.isChecked -> A_4_1.setBackgroundColor(Color.RED)
                else -> Radio_Q4.setBackgroundColor(Color.RED)
            }

            //Radio Group Question 5

            when {
                A_5_4.isChecked -> {
                    //Increase Score 1
                    score += 1
                    //Change Background
                    A_5_4.setBackgroundColor(Color.GREEN)
                }
                //Easy Condition to change color checked Radio button
                A_5_2.isChecked -> A_5_2.setBackgroundColor(Color.RED)
                A_5_3.isChecked -> A_5_3.setBackgroundColor(Color.RED)
                A_5_1.isChecked -> A_5_1.setBackgroundColor(Color.RED)
                A_5_5.isChecked -> A_5_5.setBackgroundColor(Color.RED)
                else -> Radio_Q5.setBackgroundColor(Color.RED)
            }

            //Loop for Disable Check box after click submit button
            for (index in 1 until Radio_Q1.childCount)
                Radio_Q1.getChildAt(index).isEnabled = false
            for (index in 1 until Radio_Q2.childCount - 1)
                Radio_Q2.getChildAt(index).isEnabled = false
            for (index in 1 until Radio_Q3.childCount)
                Radio_Q3.getChildAt(index).isEnabled = false
            for (index in 1 until Radio_Q4.childCount)
                Radio_Q4.getChildAt(index).isEnabled = false
            for (index in 1 until Radio_Q5.childCount)
                Radio_Q5.getChildAt(index).isEnabled = false
            // Method Disable Edit Text
            userInput.isEnabled = false
            dobInput.isEnabled = false
            //Add the feature on app
            if (score == 5)
                Toast.makeText(
                    this,
                    "Congratulation $userName Your got 100% Scholarship",
                    Toast.LENGTH_SHORT
                ).show()

            //Simple Logic to find second and minute
            val endMs = System.currentTimeMillis()
            val ms = endMs - startMs
            val second = ms / 1000
            val minute = second / 60

            //Display the result method
            if (minute <= 0)
                textResult.text = "Name: $userName \n You spend: $second sec \n Result: $score/5"
            else
                textResult.text =
                    "Name: $userName \n You spend: $minute mn $second sec \n Result: $score/5"




            Submitbutton.text = "Try Again"

            //Reset everything code
            Submitbutton.setOnClickListener {
                finish()
                startActivity(intent)
            }

        }


    }
}