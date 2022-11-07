public class inal extends a.a.a.c {
	 /* # direct methods */
	 public inal ( ) {
		 /* .locals 3 */
		 final String v0 = "msg"; // const-string v0, "msg"
		 final String v0 = "data"; // const-string v0, "data"
		 final String v0 = "code"; // const-string v0, "code"
		 /* invoke-direct {p0}, La/a/a/c;-><init>()V */
		 try { // :try_start_0
			 /* new-instance v0, Ljava/lang/String; */
			 /* invoke-direct {v0, p1}, Ljava/lang/String;-><init>([B)V */
			 a.a.a.d .a ( v0 );
			 /* check-cast v0, La/a/a/c; */
			 final String v2 = "msg"; // const-string v2, "msg"
			 final String v1 = "msg"; // const-string v1, "msg"
			 (( a.a.a.c ) v0 ).get ( v1 ); // invoke-virtual {v0, v1}, La/a/a/c;->get(Ljava/lang/Object;)Ljava/lang/Object;
			 /* check-cast v1, Ljava/lang/String; */
			 (( com.doodlemobile.gamecenter.c.n ) p0 ).put ( v2, v1 ); // invoke-virtual {p0, v2, v1}, Lcom/doodlemobile/gamecenter/c/n;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
			 final String v2 = "code"; // const-string v2, "code"
			 final String v1 = "code"; // const-string v1, "code"
			 (( a.a.a.c ) v0 ).get ( v1 ); // invoke-virtual {v0, v1}, La/a/a/c;->get(Ljava/lang/Object;)Ljava/lang/Object;
			 /* check-cast v1, Ljava/lang/Long; */
			 (( com.doodlemobile.gamecenter.c.n ) p0 ).put ( v2, v1 ); // invoke-virtual {p0, v2, v1}, Lcom/doodlemobile/gamecenter/c/n;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
			 final String v1 = "data"; // const-string v1, "data"
			 final String v2 = "data"; // const-string v2, "data"
			 (( a.a.a.c ) v0 ).get ( v2 ); // invoke-virtual {v0, v2}, La/a/a/c;->get(Ljava/lang/Object;)Ljava/lang/Object;
			 (( com.doodlemobile.gamecenter.c.n ) p0 ).put ( v1, v0 ); // invoke-virtual {p0, v1, v0}, Lcom/doodlemobile/gamecenter/c/n;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
			 /* :try_end_0 */
			 /* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
		 } // :goto_0
		 return;
		 /* :catch_0 */
		 /* move-exception v0 */
		 (( java.lang.Exception ) v0 ).printStackTrace ( ); // invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
	 } // .end method
	 /* # virtual methods */
	 public final Long b ( ) {
		 /* .locals 2 */
		 try { // :try_start_0
			 final String v0 = "code"; // const-string v0, "code"
			 (( com.doodlemobile.gamecenter.c.n ) p0 ).get ( v0 ); // invoke-virtual {p0, v0}, Lcom/doodlemobile/gamecenter/c/n;->get(Ljava/lang/Object;)Ljava/lang/Object;
			 /* check-cast p0, Ljava/lang/Long; */
			 (( java.lang.Long ) p0 ).longValue ( ); // invoke-virtual {p0}, Ljava/lang/Long;->longValue()J
			 /* :try_end_0 */
			 /* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
			 /* move-result-wide v0 */
		 } // :goto_0
		 /* return-wide v0 */
		 /* :catch_0 */
		 /* move-exception v0 */
		 (( java.lang.Exception ) v0 ).printStackTrace ( ); // invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
		 /* const-wide/16 v0, 0x0 */
	 } // .end method
	 public final a.a.a.c c ( ) {
		 /* .locals 1 */
		 try { // :try_start_0
			 final String v0 = "data"; // const-string v0, "data"
			 (( com.doodlemobile.gamecenter.c.n ) p0 ).get ( v0 ); // invoke-virtual {p0, v0}, Lcom/doodlemobile/gamecenter/c/n;->get(Ljava/lang/Object;)Ljava/lang/Object;
			 /* check-cast p0, La/a/a/c; */
			 /* :try_end_0 */
			 /* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
			 /* move-object v0, p0 */
		 } // :goto_0
		 /* :catch_0 */
		 /* move-exception v0 */
		 (( java.lang.Exception ) v0 ).printStackTrace ( ); // invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
		 int v0 = 0; // const/4 v0, 0x0
	 } // .end method
