// Test generated by RoostGPT for test go-test using AI Type Open AI and AI Model gpt-3.5-turbo

package com.team.backend;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import java.util.ArrayList;

import org.junit.Test;
import static org.assertj.core.api.Assertions.assertThat;
import static org.awaitility.Awaitility.await;

public class Screen_isSeatBooked_289c095668_Test {

    @Test
    public void testIsSeatBooked_ReturnsFalse_WhenSeatIsNotBooked() {
        Screen screen = new Screen();
        screen.setSeatBooked(false);

        await().until(() -> screen.isSeatBooked());

        assertThat(screen.isSeatBooked()).isFalse();
    }

    @Test
    public void testIsSeatBooked_ReturnsTrue_WhenSeatIsBooked() {
        Screen screen = new Screen();
        screen.setSeatBooked(true);

        await().until(() -> screen.isSeatBooked());

        assertThat(screen.isSeatBooked()).isTrue();
    }

    private class Screen {
        private boolean seatBooked;

        public boolean isSeatBooked() {
            return seatBooked;
        }

        public void setSeatBooked(boolean seatBooked) {
            this.seatBooked = seatBooked;
        }
    }
}
