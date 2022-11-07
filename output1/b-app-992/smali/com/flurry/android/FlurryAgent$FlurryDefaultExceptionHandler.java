public class com.flurry.android.FlurryAgent$FlurryDefaultExceptionHandler implements java.lang.Thread$UncaughtExceptionHandler {
	 /* # interfaces */
	 /* # instance fields */
	 private java.lang.Thread$UncaughtExceptionHandler a;
	 /* # direct methods */
	 com.flurry.android.FlurryAgent$FlurryDefaultExceptionHandler ( ) {
		 /* .locals 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 java.lang.Thread .getDefaultUncaughtExceptionHandler ( );
		 this.a = v0;
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void uncaughtException ( java.lang.Thread p0, java.lang.Throwable p1 ) {
		 /* .locals 3 */
		 try { // :try_start_0
			 com.flurry.android.FlurryAgent .d ( );
			 (( com.flurry.android.FlurryAgent ) v0 ).a ( p2 ); // invoke-virtual {v0, p2}, Lcom/flurry/android/FlurryAgent;->a(Ljava/lang/Throwable;)V
			 /* :try_end_0 */
			 /* .catch Ljava/lang/Throwable; {:try_start_0 ..:try_end_0} :catch_0 */
		 } // :goto_0
		 v0 = this.a;
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 v0 = this.a;
		 } // :cond_0
		 return;
		 /* :catch_0 */
		 /* move-exception v0 */
		 final String v1 = "FlurryAgent"; // const-string v1, "FlurryAgent"
		 final String v2 = ""; // const-string v2, ""
		 com.flurry.android.ah .b ( v1,v2,v0 );
	 } // .end method
