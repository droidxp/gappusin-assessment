public class net.chobin.android.a.w implements net.chobin.android.a.t {
	 /* # interfaces */
	 /* # instance fields */
	 private Integer a;
	 private Long a;
	 private net.chobin.android.a.u a;
	 private Long b;
	 private Long c;
	 private Long d;
	 private Long e;
	 /* # direct methods */
	 public net.chobin.android.a.w ( ) {
		 /* .locals 3 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* const-wide/16 v0, 0x0 */
		 /* iput-wide v0, p0, Lnet/chobin/android/a/w;->e:J */
		 net.chobin.android.a.q .a ( p1 );
		 final String v0 = "net.chobin.android.utils.ServerManagedPolicy"; // const-string v0, "net.chobin.android.utils.ServerManagedPolicy"
		 int v1 = 0; // const/4 v1, 0x0
		 (( android.content.Context ) p1 ).getSharedPreferences ( v0, v1 ); // invoke-virtual {p1, v0, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;
		 /* new-instance v1, Lnet/chobin/android/a/u; */
		 /* invoke-direct {v1, p1, v0, p2}, Lnet/chobin/android/a/u;-><init>(Landroid/content/Context;Landroid/content/SharedPreferences;Lnet/chobin/android/a/s;)V */
		 this.a = v1;
		 v0 = this.a;
		 final String v1 = "lastResponse"; // const-string v1, "lastResponse"
		 /* const/16 v2, 0x123 */
		 java.lang.Integer .toString ( v2 );
		 (( net.chobin.android.a.u ) v0 ).a ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Lnet/chobin/android/a/u;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
		 v0 = 		 java.lang.Integer .parseInt ( v0 );
		 /* iput v0, p0, Lnet/chobin/android/a/w;->a:I */
		 v0 = this.a;
		 final String v1 = "valivalichobin"; // const-string v1, "valivalichobin"
		 final String v2 = "0"; // const-string v2, "0"
		 (( net.chobin.android.a.u ) v0 ).a ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Lnet/chobin/android/a/u;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
		 java.lang.Long .parseLong ( v0 );
		 /* move-result-wide v0 */
		 /* iput-wide v0, p0, Lnet/chobin/android/a/w;->a:J */
		 v0 = this.a;
		 final String v1 = "retryUntil"; // const-string v1, "retryUntil"
		 final String v2 = "0"; // const-string v2, "0"
		 (( net.chobin.android.a.u ) v0 ).a ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Lnet/chobin/android/a/u;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
		 java.lang.Long .parseLong ( v0 );
		 /* move-result-wide v0 */
		 /* iput-wide v0, p0, Lnet/chobin/android/a/w;->b:J */
		 v0 = this.a;
		 final String v1 = "maxRetries"; // const-string v1, "maxRetries"
		 final String v2 = "0"; // const-string v2, "0"
		 (( net.chobin.android.a.u ) v0 ).a ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Lnet/chobin/android/a/u;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
		 java.lang.Long .parseLong ( v0 );
		 /* move-result-wide v0 */
		 /* iput-wide v0, p0, Lnet/chobin/android/a/w;->c:J */
		 v0 = this.a;
		 final String v1 = "retryCount"; // const-string v1, "retryCount"
		 final String v2 = "0"; // const-string v2, "0"
		 (( net.chobin.android.a.u ) v0 ).a ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Lnet/chobin/android/a/u;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
		 java.lang.Long .parseLong ( v0 );
		 /* move-result-wide v0 */
		 /* iput-wide v0, p0, Lnet/chobin/android/a/w;->d:J */
		 return;
	 } // .end method
	 private java.util.Map a ( java.lang.String p0 ) {
		 /* .locals 4 */
		 /* new-instance v1, Ljava/util/HashMap; */
		 /* invoke-direct {v1}, Ljava/util/HashMap;-><init>()V */
		 try { // :try_start_0
			 /* new-instance v0, Ljava/net/URI; */
			 /* new-instance v2, Ljava/lang/StringBuilder; */
			 final String v3 = "?"; // const-string v3, "?"
			 /* invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
			 (( java.lang.StringBuilder ) v2 ).append ( p1 ); // invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
			 (( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
			 /* invoke-direct {v0, v2}, Ljava/net/URI;-><init>(Ljava/lang/String;)V */
			 final String v2 = "UTF-8"; // const-string v2, "UTF-8"
			 org.apache.http.client.utils.URLEncodedUtils .parse ( v0,v2 );
		 v0 = 		 } // :goto_0
		 /* if-nez v0, :cond_0 */
	 } // :goto_1
} // :cond_0
/* check-cast v0, Lorg/apache/http/NameValuePair; */
/* :try_end_0 */
/* .catch Ljava/net/URISyntaxException; {:try_start_0 ..:try_end_0} :catch_0 */
/* :catch_0 */
/* move-exception v0 */
final String v0 = "ServerManagedPolicy: Invalid syntax error while decoding extras data from server."; // const-string v0, "ServerManagedPolicy: Invalid syntax error while decoding extras data from server."
net.chobin.android.a.q .a ( v0 );
} // .end method
private void a ( Integer p0 ) {
/* .locals 3 */
net.chobin.android.a.x .a ( );
/* move-result-wide v0 */
/* iput-wide v0, p0, Lnet/chobin/android/a/w;->e:J */
/* iput p1, p0, Lnet/chobin/android/a/w;->a:I */
v0 = this.a;
final String v1 = "lastResponse"; // const-string v1, "lastResponse"
java.lang.Integer .toString ( p1 );
(( net.chobin.android.a.u ) v0 ).a ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Lnet/chobin/android/a/u;->a(Ljava/lang/String;Ljava/lang/String;)V
return;
} // .end method
private void a ( Long p0 ) {
/* .locals 3 */
/* iput-wide p1, p0, Lnet/chobin/android/a/w;->d:J */
v0 = this.a;
final String v1 = "retryCount"; // const-string v1, "retryCount"
java.lang.Long .toString ( p1,p2 );
(( net.chobin.android.a.u ) v0 ).a ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Lnet/chobin/android/a/u;->a(Ljava/lang/String;Ljava/lang/String;)V
return;
} // .end method
private void a ( java.lang.String p0 ) {
/* .locals 4 */
try { // :try_start_0
	 java.lang.Long .parseLong ( p1 );
	 /* move-result-wide v0 */
	 java.lang.Long .valueOf ( v0,v1 );
	 /* :try_end_0 */
	 /* .catch Ljava/lang/NumberFormatException; {:try_start_0 ..:try_end_0} :catch_0 */
} // :goto_0
(( java.lang.Long ) v0 ).longValue ( ); // invoke-virtual {v0}, Ljava/lang/Long;->longValue()J
/* move-result-wide v0 */
/* iput-wide v0, p0, Lnet/chobin/android/a/w;->a:J */
v0 = this.a;
final String v1 = "valivalichobin"; // const-string v1, "valivalichobin"
(( net.chobin.android.a.u ) v0 ).a ( v1, p1 ); // invoke-virtual {v0, v1, p1}, Lnet/chobin/android/a/u;->a(Ljava/lang/String;Ljava/lang/String;)V
return;
/* :catch_0 */
/* move-exception v0 */
final String v0 = "ServerManagedPolicy: License validity timestamp (VT) missing, caching for a minute"; // const-string v0, "ServerManagedPolicy: License validity timestamp (VT) missing, caching for a minute"
net.chobin.android.a.q .a ( v0 );
net.chobin.android.a.x .a ( );
/* move-result-wide v0 */
/* const-wide/32 v2, 0xea60 */
/* add-long/2addr v0, v2 */
java.lang.Long .valueOf ( v0,v1 );
(( java.lang.Long ) v0 ).longValue ( ); // invoke-virtual {v0}, Ljava/lang/Long;->longValue()J
/* move-result-wide v1 */
java.lang.Long .toString ( v1,v2 );
} // .end method
private void b ( java.lang.String p0 ) {
/* .locals 2 */
try { // :try_start_0
	 java.lang.Long .parseLong ( p1 );
	 /* move-result-wide v0 */
	 java.lang.Long .valueOf ( v0,v1 );
	 /* :try_end_0 */
	 /* .catch Ljava/lang/NumberFormatException; {:try_start_0 ..:try_end_0} :catch_0 */
} // :goto_0
(( java.lang.Long ) v0 ).longValue ( ); // invoke-virtual {v0}, Ljava/lang/Long;->longValue()J
/* move-result-wide v0 */
/* iput-wide v0, p0, Lnet/chobin/android/a/w;->b:J */
v0 = this.a;
final String v1 = "retryUntil"; // const-string v1, "retryUntil"
(( net.chobin.android.a.u ) v0 ).a ( v1, p1 ); // invoke-virtual {v0, v1, p1}, Lnet/chobin/android/a/u;->a(Ljava/lang/String;Ljava/lang/String;)V
return;
/* :catch_0 */
/* move-exception v0 */
final String v0 = "ServerManagedPolicy: License retry timestamp (GT) missing, grace period disabled"; // const-string v0, "ServerManagedPolicy: License retry timestamp (GT) missing, grace period disabled"
net.chobin.android.a.q .a ( v0 );
final String p1 = "0"; // const-string p1, "0"
/* const-wide/16 v0, 0x0 */
java.lang.Long .valueOf ( v0,v1 );
} // .end method
private void c ( java.lang.String p0 ) {
/* .locals 2 */
try { // :try_start_0
	 java.lang.Long .parseLong ( p1 );
	 /* move-result-wide v0 */
	 java.lang.Long .valueOf ( v0,v1 );
	 /* :try_end_0 */
	 /* .catch Ljava/lang/NumberFormatException; {:try_start_0 ..:try_end_0} :catch_0 */
} // :goto_0
(( java.lang.Long ) v0 ).longValue ( ); // invoke-virtual {v0}, Ljava/lang/Long;->longValue()J
/* move-result-wide v0 */
/* iput-wide v0, p0, Lnet/chobin/android/a/w;->c:J */
v0 = this.a;
final String v1 = "maxRetries"; // const-string v1, "maxRetries"
(( net.chobin.android.a.u ) v0 ).a ( v1, p1 ); // invoke-virtual {v0, v1, p1}, Lnet/chobin/android/a/u;->a(Ljava/lang/String;Ljava/lang/String;)V
return;
/* :catch_0 */
/* move-exception v0 */
final String v0 = "ServerManagedPolicy: Licence retry count (GR) missing, grace period disabled"; // const-string v0, "ServerManagedPolicy: Licence retry count (GR) missing, grace period disabled"
net.chobin.android.a.q .a ( v0 );
final String p1 = "0"; // const-string p1, "0"
/* const-wide/16 v0, 0x0 */
java.lang.Long .valueOf ( v0,v1 );
} // .end method
/* # virtual methods */
public void a ( Integer p0, Object p1 ) {
/* .locals 4 */
/* const/16 v0, 0x123 */
/* if-eq p1, v0, :cond_1 */
/* const-wide/16 v0, 0x0 */
/* invoke-direct {p0, v0, v1}, Lnet/chobin/android/a/w;->a(J)V */
} // :goto_0
/* const/16 v0, 0x100 */
/* if-ne p1, v0, :cond_2 */
v0 = this.d;
/* invoke-direct {p0, v0}, Lnet/chobin/android/a/w;->a(Ljava/lang/String;)Ljava/util/Map; */
/* iput p1, p0, Lnet/chobin/android/a/w;->a:I */
final String v0 = "VT"; // const-string v0, "VT"
/* check-cast v0, Ljava/lang/String; */
/* invoke-direct {p0, v0}, Lnet/chobin/android/a/w;->a(Ljava/lang/String;)V */
final String v0 = "GT"; // const-string v0, "GT"
/* check-cast v0, Ljava/lang/String; */
/* invoke-direct {p0, v0}, Lnet/chobin/android/a/w;->b(Ljava/lang/String;)V */
final String v0 = "GR"; // const-string v0, "GR"
/* check-cast v0, Ljava/lang/String; */
/* invoke-direct {p0, v0}, Lnet/chobin/android/a/w;->c(Ljava/lang/String;)V */
} // :cond_0
} // :goto_1
/* invoke-direct {p0, p1}, Lnet/chobin/android/a/w;->a(I)V */
v0 = this.a;
(( net.chobin.android.a.u ) v0 ).a ( ); // invoke-virtual {v0}, Lnet/chobin/android/a/u;->a()V
return;
} // :cond_1
/* iget-wide v0, p0, Lnet/chobin/android/a/w;->d:J */
/* const-wide/16 v2, 0x1 */
/* add-long/2addr v0, v2 */
/* invoke-direct {p0, v0, v1}, Lnet/chobin/android/a/w;->a(J)V */
} // :cond_2
/* const/16 v0, 0x231 */
/* if-ne p1, v0, :cond_0 */
final String v0 = "0"; // const-string v0, "0"
/* invoke-direct {p0, v0}, Lnet/chobin/android/a/w;->a(Ljava/lang/String;)V */
final String v0 = "0"; // const-string v0, "0"
/* invoke-direct {p0, v0}, Lnet/chobin/android/a/w;->b(Ljava/lang/String;)V */
final String v0 = "0"; // const-string v0, "0"
/* invoke-direct {p0, v0}, Lnet/chobin/android/a/w;->c(Ljava/lang/String;)V */
} // .end method
public Boolean a ( ) {
/* .locals 8 */
int v0 = 1; // const/4 v0, 0x1
net.chobin.android.a.x .a ( );
/* move-result-wide v2 */
/* iget v4, p0, Lnet/chobin/android/a/w;->a:I */
/* const/16 v5, 0x100 */
/* if-ne v4, v5, :cond_1 */
/* iget-wide v4, p0, Lnet/chobin/android/a/w;->a:J */
/* cmp-long v2, v2, v4 */
/* if-gtz v2, :cond_2 */
} // :cond_0
} // :goto_0
} // :cond_1
/* iget v4, p0, Lnet/chobin/android/a/w;->a:I */
/* const/16 v5, 0x123 */
/* if-ne v4, v5, :cond_2 */
/* iget-wide v4, p0, Lnet/chobin/android/a/w;->e:J */
/* const-wide/32 v6, 0xea60 */
/* add-long/2addr v4, v6 */
/* cmp-long v4, v2, v4 */
/* if-gez v4, :cond_2 */
/* iget-wide v4, p0, Lnet/chobin/android/a/w;->b:J */
/* cmp-long v2, v2, v4 */
/* if-lez v2, :cond_0 */
/* iget-wide v2, p0, Lnet/chobin/android/a/w;->d:J */
/* iget-wide v4, p0, Lnet/chobin/android/a/w;->c:J */
/* cmp-long v2, v2, v4 */
/* if-lez v2, :cond_0 */
/* move v0, v1 */
} // :cond_2
/* move v0, v1 */
} // .end method
