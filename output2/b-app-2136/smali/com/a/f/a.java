public class com.a.f.a extends com.a.f.b {
	 /* # instance fields */
	 com.a.f.i a;
	 /* # direct methods */
	 public com.a.f.a ( ) {
		 /* .locals 1 */
		 /* invoke-direct {p0}, Lcom/a/f/b;-><init>()V */
		 int v0 = 0; // const/4 v0, 0x0
		 this.a = v0;
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void a ( ) {
		 /* .locals 1 */
		 int v0 = 0; // const/4 v0, 0x0
		 this.b = v0;
		 /* new-instance v0, Ljava/lang/StringBuffer; */
		 /* invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V */
		 this.b = v0;
		 return;
	 } // .end method
	 public void a ( java.lang.String p0, java.lang.String p1 ) {
		 /* .locals 1 */
		 try { // :try_start_0
			 v0 = this.a;
			 (( com.a.f.i ) v0 ).a ( p1, p2 ); // invoke-virtual {v0, p1, p2}, Lcom/a/f/i;->a(Ljava/lang/String;Ljava/lang/String;)V
			 /* :try_end_0 */
			 /* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
		 } // :goto_0
		 return;
		 /* :catch_0 */
		 /* move-exception v0 */
	 } // .end method
	 public void b ( ) {
		 /* .locals 1 */
		 int v0 = 0; // const/4 v0, 0x0
		 this.a = v0;
		 /* new-instance v0, Lcom/a/f/i; */
		 /* invoke-direct {v0}, Lcom/a/f/i;-><init>()V */
		 this.a = v0;
		 v0 = this.a;
		 (( com.a.f.i ) v0 ).a ( ); // invoke-virtual {v0}, Lcom/a/f/i;->a()V
		 return;
	 } // .end method
	 public void c ( ) {
		 /* .locals 2 */
		 v0 = this.a;
		 (( com.a.f.i ) v0 ).b ( ); // invoke-virtual {v0}, Lcom/a/f/i;->b()V
		 v0 = this.b;
		 v1 = this.a;
		 (( com.a.f.i ) v1 ).toString ( ); // invoke-virtual {v1}, Lcom/a/f/i;->toString()Ljava/lang/String;
		 (( java.lang.StringBuffer ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
		 return;
	 } // .end method
	 public void d ( ) {
		 /* .locals 1 */
		 int v0 = 0; // const/4 v0, 0x0
		 this.b = v0;
		 this.a = v0;
		 return;
	 } // .end method
	 public java.lang.String e ( ) {
		 /* .locals 1 */
		 v0 = this.b;
		 (( java.lang.StringBuffer ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
	 } // .end method
