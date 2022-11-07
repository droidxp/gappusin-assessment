public class de.roderick.weberknecht.WebSocketMessage {
	 /* .source "WebSocketMessage.java" */
	 /* # instance fields */
	 private java.lang.Byte message;
	 public java.lang.String msg;
	 /* # direct methods */
	 public de.roderick.weberknecht.WebSocketMessage ( ) {
		 /* .locals 0 */
		 /* .prologue */
		 /* .line 28 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 public de.roderick.weberknecht.WebSocketMessage ( ) {
		 /* .locals 0 */
		 /* .param p1, "message" # [Ljava/lang/Byte; */
		 /* .prologue */
		 /* .line 30 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 32 */
		 this.message = p1;
		 /* .line 33 */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public java.lang.String getText ( ) {
		 /* .locals 5 */
		 /* .prologue */
		 /* .line 38 */
		 v3 = this.message;
		 /* array-length v3, v3 */
		 /* new-array v1, v3, [B */
		 /* .line 39 */
		 /* .local v1, "message":[B */
		 int v0 = 0; // const/4 v0, 0x0
		 /* .local v0, "i":I */
	 } // :goto_0
	 v3 = this.message;
	 /* array-length v3, v3 */
	 /* if-lt v0, v3, :cond_0 */
	 /* .line 43 */
	 try { // :try_start_0
		 /* new-instance v3, Ljava/lang/String; */
		 final String v4 = "UTF-8"; // const-string v4, "UTF-8"
		 /* invoke-direct {v3, v1, v4}, Ljava/lang/String;-><init>([BLjava/lang/String;)V */
		 /* :try_end_0 */
		 /* .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 ..:try_end_0} :catch_0 */
		 /* .line 46 */
	 } // :goto_1
	 /* .line 40 */
} // :cond_0
v3 = this.message;
/* aget-object v3, v3, v0 */
v3 = (( java.lang.Byte ) v3 ).byteValue ( ); // invoke-virtual {v3}, Ljava/lang/Byte;->byteValue()B
/* aput-byte v3, v1, v0 */
/* .line 39 */
/* add-int/lit8 v0, v0, 0x1 */
/* .line 45 */
/* :catch_0 */
/* move-exception v2 */
/* .line 46 */
/* .local v2, "uee":Ljava/io/UnsupportedEncodingException; */
int v3 = 0; // const/4 v3, 0x0
} // .end method
