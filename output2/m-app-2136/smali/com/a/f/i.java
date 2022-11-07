public class com.a.f.i {
	 /* # instance fields */
	 private org.json.JSONStringer a;
	 /* # direct methods */
	 public com.a.f.i ( ) {
		 /* .locals 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* new-instance v0, Lorg/json/JSONStringer; */
		 /* invoke-direct {v0}, Lorg/json/JSONStringer;-><init>()V */
		 this.a = v0;
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void a ( ) {
		 /* .locals 1 */
		 try { // :try_start_0
			 v0 = this.a;
			 (( org.json.JSONStringer ) v0 ).object ( ); // invoke-virtual {v0}, Lorg/json/JSONStringer;->object()Lorg/json/JSONStringer;
			 /* :try_end_0 */
			 /* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
		 } // :goto_0
		 return;
		 /* :catch_0 */
		 /* move-exception v0 */
	 } // .end method
	 public void a ( java.lang.String p0, java.lang.String p1 ) {
		 /* .locals 1 */
		 try { // :try_start_0
			 v0 = this.a;
			 (( org.json.JSONStringer ) v0 ).key ( p1 ); // invoke-virtual {v0, p1}, Lorg/json/JSONStringer;->key(Ljava/lang/String;)Lorg/json/JSONStringer;
			 v0 = this.a;
			 (( org.json.JSONStringer ) v0 ).value ( p2 ); // invoke-virtual {v0, p2}, Lorg/json/JSONStringer;->value(Ljava/lang/Object;)Lorg/json/JSONStringer;
			 /* :try_end_0 */
			 /* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
		 } // :goto_0
		 return;
		 /* :catch_0 */
		 /* move-exception v0 */
	 } // .end method
	 public void b ( ) {
		 /* .locals 1 */
		 try { // :try_start_0
			 v0 = this.a;
			 (( org.json.JSONStringer ) v0 ).endObject ( ); // invoke-virtual {v0}, Lorg/json/JSONStringer;->endObject()Lorg/json/JSONStringer;
			 /* :try_end_0 */
			 /* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
		 } // :goto_0
		 return;
		 /* :catch_0 */
		 /* move-exception v0 */
	 } // .end method
	 public java.lang.String toString ( ) {
		 /* .locals 1 */
		 v0 = this.a;
		 (( org.json.JSONStringer ) v0 ).toString ( ); // invoke-virtual {v0}, Lorg/json/JSONStringer;->toString()Ljava/lang/String;
	 } // .end method
