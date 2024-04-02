package com.example.historyclassifier

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView


class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    private lateinit var editTextAge: EditText
    private lateinit var tvResult: TextView
    private lateinit var classifyButton: Button
    private lateinit var eraseButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var editTextAge: EditText = findViewById<EditText?>(R.id.editTextAge)
        val classifyButton: Button = findViewById(R.id.classifyButton)
        val eraseButton: Button = findViewById(R.id.eraseButton)
        val tvResult: TextView = findViewById(R.id.tvResult)

        classifyButton.setOnClickListener {
            classifyAge()
        }

        eraseButton.setOnClickListener {
            clearInfo()
        }
    }

    private fun clearInfo() {
        editTextAge.text.clear()
        tvResult.text = ""
    }

    private fun classifyAge() {
        val age = editTextAge.text.toString()
        if (age == null || age > 99.toString()) {
            tvResult.text = "Please enter a valid age between 1-99."
        } else {
            val result = when (age) {
                1.toString() -> "Infant - Joan of Arc"
                2.toString() -> "Infant - Tutankhamun"
                3.toString() -> "Infant - Mozart"
                4.toString() -> "Infant - Anne Frank"
                5.toString() -> "Infant - Socrates"
                6.toString() -> "Infant - Alexander the Great"
                7.toString() -> "Infant - Cleopatra"
                8.toString() -> "Infant - Isaac Newton"
                9.toString() -> "Infant - Vincent van Gogh"
                10.toString() -> "Child - Malala Yousafzai"
                11.toString() -> "Child - Anne Frank"
                12.toString() -> "Child - Joan of Arc"
                13.toString() -> "Child - Mozart"
                14.toString() -> "Child - William Shakespeare"
                15.toString() -> "Teenager - Anne Frank"
                16.toString() -> "Teenager - Alexander the Great"
                17.toString() -> "Teenager - Joan of Arc"
                18.toString() -> "Teenager - Mary Shelley"
                19.toString() -> "Teenager - Jane Austen"
                20.toString() -> "Young Adult - Frida Kahlo"
                21.toString() -> "Young Adult - Ernest Hemingway"
                22.toString() -> "Young Adult - Sylvia Plath"
                23.toString() -> "Young Adult - James Dean"
                24.toString() -> "Young Adult - Freddie Mercury"
                25.toString() -> "Young Adult - John Keats"
                26.toString() -> "Young Adult - Kurt Cobain"
                27.toString() -> "Young Adult - Jimi Hendrix"
                28.toString() -> "Young Adult - Vincent van Gogh"
                29.toString() -> "Young Adult - Alexander the Great"
                30.toString() -> "Adult - Albert Einstein"
                31.toString() -> "Adult - Princess Diana"
                32.toString() -> "Adult - Leonardo da Vinci"
                33.toString() -> "Adult - Queen Elizabeth I"
                34.toString() -> "Adult - Bill Gates"
                35.toString() -> "Adult - Vincent van Gogh"
                36.toString() -> "Adult - Martin Luther King Jr."
                37.toString() -> "Adult - Cleopatra"
                38.toString() -> "Adult - John F. Kennedy Jr."
                39.toString() -> "Adult - Malcolm X"
                40.toString() -> "Adult - Mark Twain"
                41.toString() -> "Adult - Leonardo da Vinci"
                42.toString() -> "Adult - Abraham Lincoln"
                43.toString() -> "Adult - Martin Luther King Jr."
                44.toString() -> "Adult - Mother Teresa"
                45.toString() -> "Adult - Mahatma Gandhi"
                46.toString() -> "Adult - Anne Frank"
                47.toString() -> "Adult - Frida Kahlo"
                48.toString() -> "Adult - William Shakespeare"
                49.toString() -> "Adult - George Washington"
                50.toString() -> "Adult - Vincent van Gogh"
                51.toString() -> "Adult - Marilyn Monroe"
                52.toString() -> "Adult - Charles Darwin"
                53.toString() -> "Adult - Ludwig van Beethoven"
                54.toString() -> "Adult - John F. Kennedy"
                55.toString() -> "Adult - Emily Dickinson"
                56.toString() -> "Adult - Pablo Picasso"
                57.toString() -> "Adult - Cleopatra"
                58.toString() -> "Adult - Princess Diana"
                59.toString() -> "Adult - George Washington"
                60.toString() -> "Adult - Vincent van Gogh"
                61.toString() -> "Adult - Martin Luther King Jr."
                62.toString() -> "Adult - Alexander the Great"
                63.toString() -> "Adult - William Shakespeare"
                64.toString() -> "Adult - Ludwig van Beethoven"
                65.toString() -> "Adult - Pablo Picasso"
                66.toString() -> "Adult - Mother Teresa"
                67.toString() -> "Adult - Nelson Mandela"
                68.toString() -> "Adult - Mahatma Gandhi"
                69.toString() -> "Adult - George Washington"
                70.toString() -> "Adult - Winston Churchill"
                71.toString() -> "Adult - Socrates"
                72.toString() -> "Adult - George Washington"
                73.toString() -> "Adult - John F. Kennedy"
                74.toString() -> "Adult - Mahatma Gandhi"
                75.toString() -> "Adult - William Shakespeare"
                76.toString() -> "Adult - Mother Teresa"
                77.toString() -> "Adult - Steve Jobs"
                78.toString() -> "Adult - Cleopatra"
                79.toString() -> "Adult - Nelson Mandela"
                80.toString() -> "Adult - Pablo Picasso"
                81.toString() -> "Adult - Martin Luther King Jr."
                82.toString() -> "Adult - William Shakespeare"
                83.toString() -> "Adult - Vincent van Gogh"
                84.toString() -> "Adult - Mother Teresa"
                85.toString() -> "Adult - George Washington"
                86.toString() -> "Adult - Mahatma Gandhi"
                87.toString() -> "Adult - Nelson Mandela"
                88.toString() -> "Adult - Cleopatra"
                89.toString() -> "Adult - William Shakespeare"
                90.toString() -> "Adult - Vincent van Gogh"
                91.toString() -> "Adult - Mother Teresa"
                92.toString() -> "Adult - George Washington"
                93.toString() -> "Adult - Mahatma Gandhi"
                94.toString() -> "Adult - Nelson Mandela"
                95.toString() -> "Adult - Cleopatra"
                96.toString() -> "Adult - William Shakespeare"
                97.toString() -> "Adult - Vincent van Gogh"
                98.toString() -> "Adult - Mother Teresa"
                99.toString() -> "Adult - George Washington"
                else -> "No Historical Figure"
            }
            tvResult.text = "The Historical Figure that matches your age is: $result"
        }
    }
}