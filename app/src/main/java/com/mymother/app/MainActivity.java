package com.mymother.app;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private TextView chatTextView;
    private EditText messageEditText;
    private Button sendButton;
    private StringBuilder conversation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        chatTextView = findViewById(R.id.chatTextView);
        messageEditText = findViewById(R.id.messageEditText);
        sendButton = findViewById(R.id.sendButton);
        conversation = new StringBuilder();

        conversation.append("MẸ: Chào con yêu! Mẹ đây!\n");
        chatTextView.setText(conversation.toString());

        sendButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String message = messageEditText.getText().toString().trim();
                if (!message.isEmpty()) {
                    conversation.append("Con: " + message + "\n");
                    conversation.append("MẸ: Mẹ nghe nè con yêu!\n\n");
                    chatTextView.setText(conversation.toString());
                    messageEditText.setText("");
                }
            }
        });
    }
}