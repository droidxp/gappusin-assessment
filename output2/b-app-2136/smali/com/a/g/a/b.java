class com.a.g.a.b implements com.kkkwan.billing.d.b {
	 /* # interfaces */
	 /* # instance fields */
	 final com.a.g.a.a a; //synthetic
	 /* # direct methods */
	 com.a.g.a.b ( ) {
		 /* .locals 0 */
		 this.a = p1;
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void a ( java.lang.String p0, java.lang.String p1, java.lang.String p2 ) {
		 /* .locals 4 */
		 int v3 = 0; // const/4 v3, 0x0
		 final String v0 = "0"; // const-string v0, "0"
		 v0 = 		 (( java.lang.String ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
		 if ( v0 != null) { // if-eqz v0, :cond_1
			 v0 = com.a.e.i.D;
			 int v1 = 1; // const/4 v1, 0x1
			 com.a.e.i .a ( v0,v1,v2 );
			 v0 = this.a;
			 com.a.g.a.a .a ( v0 );
			 final String v1 = "\u652f\u4ed8\u6210\u529f"; // const-string v1, "\u652f\u4ed8\u6210\u529f"
			 android.widget.Toast .makeText ( v0,v1,v3 );
			 (( android.widget.Toast ) v0 ).show ( ); // invoke-virtual {v0}, Landroid/widget/Toast;->show()V
		 } // :cond_0
	 } // :goto_0
	 return;
} // :cond_1
final String v0 = "1"; // const-string v0, "1"
v0 = (( java.lang.String ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v0 != null) { // if-eqz v0, :cond_2
	 v0 = com.a.e.i.D;
	 com.a.e.i .a ( v0,v3,v1 );
	 v0 = this.a;
	 com.a.g.a.a .a ( v0 );
	 final String v1 = "\u652f\u4ed8\u5931\u8d25"; // const-string v1, "\u652f\u4ed8\u5931\u8d25"
	 android.widget.Toast .makeText ( v0,v1,v3 );
	 (( android.widget.Toast ) v0 ).show ( ); // invoke-virtual {v0}, Landroid/widget/Toast;->show()V
} // :cond_2
final String v0 = "2"; // const-string v0, "2"
v0 = (( java.lang.String ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v0 != null) { // if-eqz v0, :cond_0
	 v0 = com.a.e.i.D;
	 com.a.e.i .a ( v0,v3,v1 );
	 v0 = this.a;
	 com.a.g.a.a .a ( v0 );
	 final String v1 = "\u9000\u51fa\u652f\u4ed8"; // const-string v1, "\u9000\u51fa\u652f\u4ed8"
	 android.widget.Toast .makeText ( v0,v1,v3 );
	 (( android.widget.Toast ) v0 ).show ( ); // invoke-virtual {v0}, Landroid/widget/Toast;->show()V
} // .end method
