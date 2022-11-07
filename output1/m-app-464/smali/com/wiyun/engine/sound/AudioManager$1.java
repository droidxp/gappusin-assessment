class com.wiyun.engine.sound.AudioManager$1 implements android.media.MediaPlayer$OnCompletionListener {
	 /* # interfaces */
	 /* # direct methods */
	 com.wiyun.engine.sound.AudioManager$1 ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void onCompletion ( android.media.MediaPlayer p0 ) {
		 /* .locals 1 */
		 v0 = 		 com.wiyun.engine.sound.AudioManager .access$0 ( );
		 if ( v0 != null) { // if-eqz v0, :cond_1
			 v0 = 			 com.wiyun.engine.sound.AudioManager .access$0 ( );
			 /* if-lez v0, :cond_0 */
			 v0 = 			 com.wiyun.engine.sound.AudioManager .access$0 ( );
			 /* add-int/lit8 v0, v0, -0x1 */
			 com.wiyun.engine.sound.AudioManager .access$1 ( v0 );
		 } // :cond_0
		 com.wiyun.engine.sound.AudioManager .access$2 ( );
		 (( android.media.MediaPlayer ) v0 ).start ( ); // invoke-virtual {v0}, Landroid/media/MediaPlayer;->start()V
	 } // :goto_0
	 return;
} // :cond_1
int v0 = 0; // const/4 v0, 0x0
com.wiyun.engine.sound.AudioManager .access$3 ( v0 );
} // .end method
