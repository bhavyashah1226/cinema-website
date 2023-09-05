// Test generated by RoostGPT for test go-test using AI Type Open AI and AI Model gpt-3.5-turbo

package com.team.backend;

import org.bson.types.ObjectId;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.awaitility.Awaitility.await;
import static org.hamcrest.Matchers.equalTo;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Screen_set_id_a348ed6309_Test {

    private Screen screen;

    @Before
    public void setup() {
        screen = new Screen();
    }

    @Test
    public void testSetId_SuccessfullySetId() {
        ObjectId expectedId = new ObjectId();
        screen.set_id(expectedId);

        await().until(() -> screen.get_id() != null);

        ObjectId actualId = screen.get_id();
        assertThat(actualId, equalTo(expectedId));
    }

    @Test
    public void testSetId_NullId() {
        screen.set_id(null);

        await().until(() -> screen.get_id() == null);

        ObjectId actualId = screen.get_id();
        assertThat(actualId, equalTo(null));
    }
}

class Screen {
    @Id
    private ObjectId _id;

    public ObjectId get_id() {
        return _id;
    }

    public void set_id(ObjectId _id) {
        this._id = _id;
    }
}
