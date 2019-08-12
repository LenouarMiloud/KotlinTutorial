package com.robot.anonyme.tipcalculator

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.SeekBar
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tipSeek.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener{
            override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
                tipperson.text = progress.toString() + "%"
            }

            override fun onStartTrackingTouch(seekBar: SeekBar?) {

            }

            override fun onStopTrackingTouch(seekBar: SeekBar?) {

            }

        })

        peopleSeek.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener{
            override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
                personnumber.text = progress.toString()
            }

            override fun onStartTrackingTouch(seekBar: SeekBar?) {

            }

            override fun onStopTrackingTouch(seekBar: SeekBar?) {

            }

        })

        ButtonCalculate.setOnClickListener {

            //get the bill amount
            var billamount = BillEdit.text.toString().toInt()

            //get the tip person
            var tipPerson = tipSeek.progress

            //calculate the tip amount
            var tipAmount = (billamount * tipPerson) / 100

            //calculate the total payment
            var totalPayment = billamount + tipAmount

            //get the number of people
            var numberOfPeople = peopleSeek.progress

            //calculate each person share
            var eachPersonShare = totalPayment / numberOfPeople

            //display the result
            result.text = "TOTAL $ ${totalPayment}(TIP $  ${tipAmount} \n Each Person: $ ${eachPersonShare} )"

        }

    }
}
