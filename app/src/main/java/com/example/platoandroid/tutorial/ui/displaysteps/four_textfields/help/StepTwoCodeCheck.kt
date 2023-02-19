package com.example.platoandroid.tutorial.ui.displaysteps.four_textfields.help

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun StepTwoCodeCheck() {
  Column {
    Text(text = "Your new variable should look like this:")
    Spacer(modifier = Modifier.height(8.dp))
    Text(
      text = "TextField(value = newTodoItemNameText.value, onValueChange = { /** TODO */ })",
      color = MaterialTheme.colors.primaryVariant,
      style = MaterialTheme.typography.subtitle2,
      modifier = Modifier.padding(start = 16.dp)
    )
    Spacer(modifier = Modifier.height(8.dp))
    Text(text = "Zoomed out a bit to put this variable in context, your TodoList should now look like:")
    Spacer(modifier = Modifier.height(8.dp))
    Text(
      text = "@Composable\n" +
        "fun TodoList(title: String) {\n" +
        "  Column(\n" +
        "    modifier = Modifier.padding(12.dp)\n" +
        "  ) {\n" +
        "    var viewModel: TodoListViewModel = viewModel { TodoListViewModel() }\n" +
        "    var newTodoItemNameText = remember { mutableStateOf(TextFieldValue(\"\")) }\n" +
        "    Title(title = title)\n" +
        "    // We need to add some to-do items here below vvv\n" +
        "    viewModel.todoListItems.forEach { todoListItem ->\n" +
        "      TodoListRow(\n" +
        "        todoItem = todoListItem,\n" +
        "        viewModel = viewModel,\n" +
        "      )\n" +
        "    }\n" +
        "    // ^^^ Add to-do list items above\n" +
        "    Row {\n" +
        "      TextField(value = newTodoItemNameText.value, onValueChange = {})\n" +
        "      Spacer(modifier = Modifier.width(12.dp))\n" +
        "      Button(onClick = {\n" +
        "        val newItem = TodoListItem(\n" +
        "          id = Random(101).toString(),\n" +
        "          taskName = \"still hardcoding this\",\n" +
        "          isComplete = false,\n" +
        "          completedAt = null,\n" +
        "        )\n" +
        "        viewModel.addTodoListItem(newItem)\n" +
        "      }) {\n" +
        "        Text(text = \"Add item\")\n" +
        "      }\n" +
        "    }\n" +
        "  }\n" +
        "}",
      color = MaterialTheme.colors.primaryVariant,
      style = MaterialTheme.typography.subtitle2,
      modifier = Modifier.padding(start = 16.dp)
    )
    Spacer(modifier = Modifier.height(8.dp))
  }
}