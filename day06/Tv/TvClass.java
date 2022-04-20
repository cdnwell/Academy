package Tv;

public class TvClass {
	int channel;
	int volume;
	boolean power;
	boolean mute;

	TvClass() {
		channel = 1;
		volume = 10;
		power = true;
		mute = false;
	}

	void ChannelUp() {
		if (power == true) {
			if (channel == 567) {
				channel = 1;
			} else {
				channel += 1;
			}
		}
	}

	void ChannelDown() {
		if (power == true) {
			if (channel == 1) {
				channel = 567;
			} else {
				channel -= 1;
			}
		}
	}

	void VolumeUp() {
		if (volume == 40) {

		} else if (power == true) {
			volume += 1;
		}
	}

	void VolumeDown() {
		if (volume == 1) {

		} else if (power == true) {
			volume -= 1;
		}
	}

	void PowerSwitch() {
		if (power == true) {
			power = false;
		} else {
			power = true;
			channel = 1;
			volume = 10;
			power = true;
			mute = false;
		}
	}

	void MuteSwitch() {
		if (power == true) {
			if (mute == true) {
				mute = false;
			} else {
				mute = true;
			}
		}

	}
}
