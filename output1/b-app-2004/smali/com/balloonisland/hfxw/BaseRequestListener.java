public abstract class com.balloonisland.hfxw.BaseRequestListener implements com.facebook.android.AsyncFacebookRunner$RequestListener {
	 /* .source "BaseRequestListener.java" */
	 /* # interfaces */
	 /* # direct methods */
	 public com.balloonisland.hfxw.BaseRequestListener ( ) {
		 /* .locals 0 */
		 /* .prologue */
		 /* .line 15 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void onFacebookError ( com.facebook.android.FacebookError p0, java.lang.Object p1 ) {
		 /* .locals 0 */
		 /* .param p1, "e" # Lcom/facebook/android/FacebookError; */
		 /* .param p2, "state" # Ljava/lang/Object; */
		 /* .prologue */
		 /* .line 19 */
		 (( com.facebook.android.FacebookError ) p1 ).printStackTrace ( ); // invoke-virtual {p1}, Lcom/facebook/android/FacebookError;->printStackTrace()V
		 /* .line 20 */
		 return;
	 } // .end method
	 public void onFileNotFoundException ( java.io.FileNotFoundException p0, java.lang.Object p1 ) {
		 /* .locals 0 */
		 /* .param p1, "e" # Ljava/io/FileNotFoundException; */
		 /* .param p2, "state" # Ljava/lang/Object; */
		 /* .prologue */
		 /* .line 24 */
		 (( java.io.FileNotFoundException ) p1 ).printStackTrace ( ); // invoke-virtual {p1}, Ljava/io/FileNotFoundException;->printStackTrace()V
		 /* .line 25 */
		 return;
	 } // .end method
	 public void onIOException ( java.io.IOException p0, java.lang.Object p1 ) {
		 /* .locals 0 */
		 /* .param p1, "e" # Ljava/io/IOException; */
		 /* .param p2, "state" # Ljava/lang/Object; */
		 /* .prologue */
		 /* .line 29 */
		 (( java.io.IOException ) p1 ).printStackTrace ( ); // invoke-virtual {p1}, Ljava/io/IOException;->printStackTrace()V
		 /* .line 30 */
		 return;
	 } // .end method
	 public void onMalformedURLException ( java.net.MalformedURLException p0, java.lang.Object p1 ) {
		 /* .locals 0 */
		 /* .param p1, "e" # Ljava/net/MalformedURLException; */
		 /* .param p2, "state" # Ljava/lang/Object; */
		 /* .prologue */
		 /* .line 34 */
		 (( java.net.MalformedURLException ) p1 ).printStackTrace ( ); // invoke-virtual {p1}, Ljava/net/MalformedURLException;->printStackTrace()V
		 /* .line 35 */
		 return;
	 } // .end method
