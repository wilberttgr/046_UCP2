package com.example.exercise2

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedCard
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.exercise2.ui.theme.Exercise2Theme

@Composable
fun HalamanHome(
    onNextButtonClicked: () -> Unit)
{
    val image = painterResource(id = R.drawable.logo)
    Column (modifier = Modifier,
        verticalArrangement = Arrangement.SpaceBetween){
        OutlinedCard (
             modifier = Modifier
                .fillMaxWidth(0.95f)
                .padding(vertical = 50.dp)
                .align(Alignment.CenterHorizontally)
        ){
            Column (horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)) {
                Image(
                    painter = image,
                    contentDescription = null,
                    contentScale = ContentScale.Crop
                )
            }
        }
        Row (
            modifier = Modifier
                .fillMaxWidth()
                .padding(dimensionResource(R.dimen.padding_medium))
                .weight(1f, false),
            horizontalArrangement = Arrangement.spacedBy(dimensionResource(R.dimen.padding_medium))
        ){
            Button(modifier = Modifier.weight(1f),
                onClick = onNextButtonClicked
            ) {
                Text(stringResource(R.string.next))
            }
        }
    }
}
@Preview(showBackground = true)
@Composable
fun PreviewHalamanHome(){
    Exercise2Theme {
        HalamanHome (onNextButtonClicked = {})
    }
}

