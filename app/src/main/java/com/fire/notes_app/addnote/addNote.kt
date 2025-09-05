package com.fire.notes_app.addnote

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import com.fire.notes_app.R
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Preview(showBackground = true)
@Composable
fun AddNote() {
    var title by remember { mutableStateOf("") }
    var content by remember { mutableStateOf("") }

    Column(modifier = Modifier.fillMaxSize()) {
        // Top Bar
        Row(modifier = Modifier.fillMaxWidth()
            .background(color = MaterialTheme.colorScheme.primary)
            .padding(horizontal = 16.dp)
            .padding(vertical = 12.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween)
            {

            Icon(modifier =Modifier.size(28.dp).clickable { /* Handle Back Navigation */ },
                imageVector = Icons.Filled.ArrowBack, contentDescription = "Back"
            , tint = Color.White)

            Text(
                text = "Add Note",
                style = TextStyle(
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.White
                )
            )

            Row {
                Icon(modifier =Modifier.size(28.dp).clickable { /* Handle Save Note */ },
                    imageVector = Icons.Filled.Check, contentDescription = "Save Note"
                    , tint = Color.White)

                Spacer(modifier = Modifier.width(16.dp))

                Icon(modifier =Modifier.size(28.dp).clickable { /* Handle Delete Note */ },
                    imageVector = Icons.Filled.Delete, contentDescription = "Delete Note"
                    , tint = Color.White)
            }
        }

        Spacer(modifier = Modifier.height(16.dp))

        // Title TextField
        TextField(
            value = title,
            onValueChange = { title = it },
            modifier = Modifier.fillMaxWidth()
                .padding(horizontal = 16.dp)
            , placeholder = {
                Text(text= "Enter Title", style = TextStyle(fontSize = 18.sp, fontWeight = FontWeight.SemiBold))
            },
            colors = TextFieldDefaults.colors(
                focusedContainerColor = Color.Transparent,
                unfocusedContainerColor = Color.Transparent,
                disabledContainerColor = Color.Transparent,
                focusedIndicatorColor = Color.Transparent,
                unfocusedIndicatorColor = Color.Transparent,
            ),
            textStyle = TextStyle(fontSize = 20.sp, fontWeight = FontWeight.Bold)
        )


        Spacer(modifier = Modifier.height(8.dp))

        // Content TextField
        TextField(
            value = content,




            onValueChange = { content = it },
            modifier = Modifier.fillMaxWidth()
                .weight(1f) // Takes remaining space
                .padding(horizontal = 16.dp)
            , placeholder = {
                Text(text= "Enter your note content here...")
            },
            colors = TextFieldDefaults.colors(
                focusedContainerColor = Color.Transparent,
                unfocusedContainerColor = Color.Transparent,
                disabledContainerColor = Color.Transparent,
                focusedIndicatorColor = Color.Transparent,
                unfocusedIndicatorColor = Color.Transparent,
            ),
            textStyle = TextStyle(fontSize = 16.sp)
        )
    }
}