package com.example.platoandroid

/**
 * TAG FOR LEARNING ABOUT IMPORTS & DEPENDENCIES
 * Below this block of comments are the imports for this file.
 *
 * Imports are we how tell the compiler that we want to use some
 * code in this file that is from a different folder in our app (but
 * still code we wrote in this project) or that we are borrowing from
 * a library. The text provided after the "import" keyword is the path
 * that tells the compiler what packages to look in to find the code
 * we want.
 *
 * If importing code from a different folder in our project, of course that
 * code lives in our project so we can just give it a path to that folder
 * based on where it lives in the project.
 *
 * If we are importing code borrowed from a library outside of our project,
 * how do we find the path? Libraries are available on the internet to
 * download & our app needs to have that library downloaded and stored in our
 * application to use. It is stored as a package in our app and we can use the
 * name of that package to tell the compiler where the code is.
 *
 * How do we download libraries so we can use them? We call libraries that
 * we need for our app "dependencies" because our app is "dependent" on them
 * to work if we are using code from them. For Android we use a tool called
 * "gradle" to be a "dependency manager" for our app. This means we just tell
 * gradle what libraries we depend on and gradle will handle downloading any
 * libraries we need and making sure the packages are stored in the right places.
 *
 * For more on gradle, search for (without typing the underscores!):
 * TAG_FOR_LEARNING_ABOUT_GRADLE
 *
 * Look at the imports below for examples of what imports from other libraries
 * and from within this project look like.
 */

/**
 * This section between the commented arrows below are examples
 * of code that we are borrowing from a library someone else built.
 * This is code from outside this project.
 */
// vvv
import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
// ^^^
/**
 * This section between the commented arrows below are examples
 * of code that lives within this project, but lives in a different
 * folder.
 *
 * Notice that TodoList, TutorialBlock, & PlatoAndroidTheme are files
 * in this project we write and maintain.
 */
// vvvvvvvvvvvvvvvvvvvvvvvvvvvvvv
import com.example.platoandroid.ui.TodoList
import com.example.platoandroid.ui.TutorialBlock
import com.example.platoandroid.ui.theme.PlatoAndroidTheme
// ^^^

/**
 * This is the main entry point to our app.
 * When you start building your first app, the first place you'll want to
 * visit to start setting up your app is you MainActivity file. This file
 * will be generated for you be Android Studio when you start a new project
 * so it will look a lot like this one (just without these comments we have
 * added for you).
 *
 * The entry point for your UI will go within the "Surface" block below.
 *
 * You can learn more about Activities by reading Android's documentation:
 * https://developer.android.com/guide/components/activities/intro-activities
 */
class MainActivity : ComponentActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContent {
      PlatoAndroidTheme {
        // A surface container using the 'background' color from the theme
        Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colors.background) {
          Column {
            TutorialBlock()

            /**
             * Add your first composable here
             * >> Hey you found it! Nice job!
             * Whenever you see these *s or the double // lines, it means the
             * text that follows it is a comment. This text won't run like code,
             * it's just so you can leave helpful notes like this one :)
             */
            // YOUR TEST AREA vvv
Text(text="android is better than apple")
            // ^^^^^ add above ^^^^^
            // ^^^ YOUR TEST AREA
        }
        }
      }
    }
  }
}

/**
 * We won't talk to much about previews throughout this tutorial but
 * they can be a super handy tool to see changes you make to your app
 * while you're coding!
 *
 * Read more about previews in Android's documentation:
 * https://developer.android.com/jetpack/compose/tooling/studio#preview-features
 */
@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
  PlatoAndroidTheme {}
}