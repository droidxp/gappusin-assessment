public abstract class com.doodlemobile.gamecenter.facebook.a implements com.a.a.h {
	 /* # interfaces */
	 /* # direct methods */
	 public com.doodlemobile.gamecenter.facebook.a ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public final void a ( Object p0 ) {
		 /* .locals 2 */
		 final String v0 = "Facebook"; // const-string v0, "Facebook"
		 (( com.a.a.d ) p1 ).getMessage ( ); // invoke-virtual {p1}, Lcom/a/a/d;->getMessage()Ljava/lang/String;
		 android.util.Log .e ( v0,v1 );
		 (( com.a.a.d ) p1 ).printStackTrace ( ); // invoke-virtual {p1}, Lcom/a/a/d;->printStackTrace()V
		 return;
	 } // .end method
	 public final void a ( java.io.FileNotFoundException p0 ) {
		 /* .locals 2 */
		 final String v0 = "Facebook"; // const-string v0, "Facebook"
		 (( java.io.FileNotFoundException ) p1 ).getMessage ( ); // invoke-virtual {p1}, Ljava/io/FileNotFoundException;->getMessage()Ljava/lang/String;
		 android.util.Log .e ( v0,v1 );
		 (( java.io.FileNotFoundException ) p1 ).printStackTrace ( ); // invoke-virtual {p1}, Ljava/io/FileNotFoundException;->printStackTrace()V
		 return;
	 } // .end method
	 public final void a ( java.io.IOException p0 ) {
		 /* .locals 2 */
		 final String v0 = "Facebook"; // const-string v0, "Facebook"
		 (( java.io.IOException ) p1 ).getMessage ( ); // invoke-virtual {p1}, Ljava/io/IOException;->getMessage()Ljava/lang/String;
		 android.util.Log .e ( v0,v1 );
		 (( java.io.IOException ) p1 ).printStackTrace ( ); // invoke-virtual {p1}, Ljava/io/IOException;->printStackTrace()V
		 return;
	 } // .end method
	 public final void a ( java.net.MalformedURLException p0 ) {
		 /* .locals 2 */
		 final String v0 = "Facebook"; // const-string v0, "Facebook"
		 (( java.net.MalformedURLException ) p1 ).getMessage ( ); // invoke-virtual {p1}, Ljava/net/MalformedURLException;->getMessage()Ljava/lang/String;
		 android.util.Log .e ( v0,v1 );
		 (( java.net.MalformedURLException ) p1 ).printStackTrace ( ); // invoke-virtual {p1}, Ljava/net/MalformedURLException;->printStackTrace()V
		 return;
	 } // .end method
