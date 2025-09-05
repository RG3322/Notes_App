package com.fire.notes_app.addnote

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import com.fire.notes_app.R
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.room.util.TableInfo


@Preview(showBackground = true)
@Composable
fun AddNote() {
    Column(modifier = Modifier.fillMaxSize()) {
        Row(modifier = Modifier.fillMaxWidth()
            .background(color = MaterialTheme.colorScheme.primary)
            .padding(horizontal = 16.dp)
            .padding(vertical = 20.dp))
            {

            Icon(modifier =Modifier.size(20.dp),
                painter = painterResource(id = R.drawable.outline_arrow_back_24), contentDescription = null
            , tint = Color.White)



                Icon(modifier =Modifier.size(20.dp),
                    painter = painterResource(id = R.drawable.outline_delete_24), contentDescription = null
                    , tint = Color.White)



            }
        TextField(
            value = "",
            onValueChange = {},
            modifier = Modifier.fillMaxWidth()
                .padding(horizontal = 16.dp)
            , placeholder = {
                Text(text= " Enter Title ")

            }
        )


                TextField(
                    value = "",
                    onValueChange = {},
                    modifier = Modifier.fillMaxWidth()
                        .padding(horizontal = 16.dp)
                    , placeholder = {
                        Text(text= " Enter Title ")
            }
        )

    }
}