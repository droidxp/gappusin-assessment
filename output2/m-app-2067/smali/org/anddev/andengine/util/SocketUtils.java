public class org.anddev.andengine.util.SocketUtils {
	 /* # direct methods */
	 public org.anddev.andengine.util.SocketUtils ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 public static void closeSocket ( java.net.DatagramSocket p0 ) {
		 /* .locals 1 */
		 if ( p0 != null) { // if-eqz p0, :cond_0
			 v0 = 			 (( java.net.DatagramSocket ) p0 ).isClosed ( ); // invoke-virtual {p0}, Ljava/net/DatagramSocket;->isClosed()Z
			 /* if-nez v0, :cond_0 */
			 (( java.net.DatagramSocket ) p0 ).close ( ); // invoke-virtual {p0}, Ljava/net/DatagramSocket;->close()V
		 } // :cond_0
		 return;
	 } // .end method
	 public static void closeSocket ( java.net.ServerSocket p0 ) {
		 /* .locals 1 */
		 if ( p0 != null) { // if-eqz p0, :cond_0
			 v0 = 			 (( java.net.ServerSocket ) p0 ).isClosed ( ); // invoke-virtual {p0}, Ljava/net/ServerSocket;->isClosed()Z
			 /* if-nez v0, :cond_0 */
			 try { // :try_start_0
				 (( java.net.ServerSocket ) p0 ).close ( ); // invoke-virtual {p0}, Ljava/net/ServerSocket;->close()V
				 /* :try_end_0 */
				 /* .catch Ljava/io/IOException; {:try_start_0 ..:try_end_0} :catch_0 */
			 } // :cond_0
		 } // :goto_0
		 return;
		 /* :catch_0 */
		 /* move-exception v0 */
		 org.anddev.andengine.util.Debug .e ( v0 );
	 } // .end method
	 public static void closeSocket ( java.net.Socket p0 ) {
		 /* .locals 1 */
		 if ( p0 != null) { // if-eqz p0, :cond_0
			 v0 = 			 (( java.net.Socket ) p0 ).isClosed ( ); // invoke-virtual {p0}, Ljava/net/Socket;->isClosed()Z
			 /* if-nez v0, :cond_0 */
			 try { // :try_start_0
				 (( java.net.Socket ) p0 ).close ( ); // invoke-virtual {p0}, Ljava/net/Socket;->close()V
				 /* :try_end_0 */
				 /* .catch Ljava/io/IOException; {:try_start_0 ..:try_end_0} :catch_0 */
			 } // :cond_0
		 } // :goto_0
		 return;
		 /* :catch_0 */
		 /* move-exception v0 */
		 org.anddev.andengine.util.Debug .e ( v0 );
	 } // .end method
