
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.sp
import androidx.compose.foundation.text.BasicText
import androidx.compose.material3.Text
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import com.example.myapplication.R
class component {



    @Composable
    fun objects() {
        Row(
            modifier = Modifier
                .width(350.dp)
                .padding(12.dp).clip(RoundedCornerShape(12.dp)).background(androidx.compose.ui.graphics.Color.Gray).
            height(75.dp).padding(top = 5.dp, bottom = 5.dp)
        ) {
            // Image does not have any Spacer before it
            Image(
                painter = painterResource(id = R.drawable.icons8_target_logo),
                contentDescription = "Example SVG",
                modifier = Modifier.size(20.dp)
            )

            // Spacer after the Image to create space between Image and Column
            Spacer(modifier = Modifier.width(8.dp) .clip(RoundedCornerShape(8.dp))) // Adjust spacing here if needed

            // Column with Text elements
            Column(
                modifier = Modifier
                    .padding(start = 8.dp)
                    .fillMaxHeight(), // Ensure Column uses the full height for spacing
                verticalArrangement = androidx.compose.foundation.layout.Arrangement.SpaceBetween // Add padding to separate Column from Image
            ) {
                Text(text = "Issue",
                    maxLines = 1,
                    fontSize = 14.sp,
                    overflow = androidx.compose.ui.text.style.TextOverflow.Ellipsis )
                Text(text = "None")
                Text(text = "Created at:",
                    maxLines = 1)
            }

            // Spacer to push the "Status" Text to the end of the Row
            Spacer(modifier = Modifier.weight(1f))

            // Text element
            Text(text = "Status")
        }
    }

@Preview(showBackground = true)
@Composable
fun show(){
    objects()
    }

}




