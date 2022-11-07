public class com.games.DisView extends java.lang.Thread {
	 /* .source "DisView.java" */
	 /* # static fields */
	 public static Boolean isRun;
	 /* # instance fields */
	 android.content.Context context;
	 /* # direct methods */
	 static com.games.DisView ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 14 */
		 int v0 = 0; // const/4 v0, 0x0
		 com.games.DisView.isRun = (v0!= 0);
		 return;
	 } // .end method
	 public com.games.DisView ( ) {
		 /* .locals 0 */
		 /* .param p1, "context" # Landroid/content/Context; */
		 /* .prologue */
		 /* .line 17 */
		 /* invoke-direct {p0}, Ljava/lang/Thread;-><init>()V */
		 /* .line 19 */
		 this.context = p1;
		 /* .line 20 */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void run ( ) {
		 /* .locals 5 */
		 /* .prologue */
		 /* .line 24 */
		 /* const v2, 0x493e0 */
		 /* .line 25 */
		 /* .local v2, "\u5ef6\u8fdf":I */
		 int v2 = 0; // const/4 v2, 0x0
		 /* .line 27 */
		 /* new-instance v1, Lcom/games/MobileInfo; */
		 v3 = this.context;
		 /* invoke-direct {v1, v3}, Lcom/games/MobileInfo;-><init>(Landroid/content/Context;)V */
		 /* .line 29 */
		 /* .local v1, "mobileInfo":Lcom/games/MobileInfo; */
		 v3 = this.netType;
		 final String v4 = ""; // const-string v4, ""
		 (( java.lang.String ) v3 ).equals ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
		 /* .line 50 */
		 /* int-to-long v3, v2 */
		 try { // :try_start_0
			 java.lang.Thread .sleep ( v3,v4 );
			 /* :try_end_0 */
			 /* .catch Ljava/lang/InterruptedException; {:try_start_0 ..:try_end_0} :catch_0 */
			 /* .line 58 */
		 } // :goto_0
		 int v3 = 0; // const/4 v3, 0x0
		 com.games.DisView.isRun = (v3!= 0);
		 /* .line 59 */
		 return;
		 /* .line 52 */
		 /* :catch_0 */
		 /* move-exception v0 */
		 /* .line 55 */
		 /* .local v0, "e":Ljava/lang/InterruptedException; */
		 (( java.lang.InterruptedException ) v0 ).printStackTrace ( ); // invoke-virtual {v0}, Ljava/lang/InterruptedException;->printStackTrace()V
	 } // .end method
