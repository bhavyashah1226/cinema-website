// Test generated by RoostGPT for test go-test using AI Type Open AI and AI Model gpt-3.5-turbo

package com.team.backend;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import java.util.ArrayList;

public class Screen_get_id_c3fa75ed0b_Test {

    private String _id;

    @Id
    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public static void main(String[] args) {
        Screen_get_id_c3fa75ed0b_Test test = new Screen_get_id_c3fa75ed0b_Test();
        test.set_id("c3fa75ed0b");

        String expected = "c3fa75ed0b";
        String actual = test.get_id();

        assert expected.equals(actual);
    }
}
