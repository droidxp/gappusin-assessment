public class com.flurry.android.FlurryAgent$FlurryDefaultExceptionHandler implements java.lang.Thread$UncaughtExceptionHandler {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # instance fields */
	 private java.lang.Thread$UncaughtExceptionHandler a;
	 /* # direct methods */
	 com.flurry.android.FlurryAgent$FlurryDefaultExceptionHandler ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 240 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 241 */
		 java.lang.Thread .getDefaultUncaughtExceptionHandler ( );
		 this.a = v0;
		 /* .line 242 */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void uncaughtException ( java.lang.Thread p0, java.lang.Throwable p1 ) {
		 /* .locals 3 */
		 /* .prologue */
		 /* .line 249 */
		 try { // :try_start_0
			 com.flurry.android.FlurryAgent .h ( );
			 (( com.flurry.android.FlurryAgent ) v0 ).a ( p2 ); // invoke-virtual {v0, p2}, Lcom/flurry/android/FlurryAgent;->a(Ljava/lang/Throwable;)V
			 /* :try_end_0 */
			 /* .catch Ljava/lang/Throwable; {:try_start_0 ..:try_end_0} :catch_0 */
			 /* .line 256 */
		 } // :goto_0
		 v0 = this.a;
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 /* .line 258 */
			 v0 = this.a;
			 /* .line 260 */
		 } // :cond_0
		 return;
		 /* .line 251 */
		 /* :catch_0 */
		 /* move-exception v0 */
		 /* .line 253 */
		 final String v1 = "FlurryAgent"; // const-string v1, "FlurryAgent"
		 final String v2 = ""; // const-string v2, ""
		 com.flurry.android.ai .b ( v1,v2,v0 );
	 } // .end method
