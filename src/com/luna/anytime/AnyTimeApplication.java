package com.luna.anytime;

import com.avos.avoscloud.AVOSCloud;

import android.app.Application;

public class AnyTimeApplication extends Application {

	@Override
	public void onCreate() {
		super.onCreate();
		AVOSCloud.useAVCloudCN();
		// U need your AVOS key and so on to run the code.
		AVOSCloud.initialize(this,
				"K3Ti4Lyb5nbKKCeMesma0D6b-gzGzoHsz",
				"pXOpgMYwjqtAG4Qooe3GqTuB");
	}
}
