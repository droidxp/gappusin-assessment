public abstract class zongfuscated.r implements zongfuscated.u {
	 /* # interfaces */
	 /* # static fields */
	 private static final java.lang.String a;
	 /* # instance fields */
	 private java.lang.Integer b;
	 private java.lang.String c;
	 private zongfuscated.h d;
	 /* # direct methods */
	 static zongfuscated.r ( ) {
		 /* .locals 1 */
		 /* const-class v0, Lzongfuscated/r; */
		 (( java.lang.Class ) v0 ).getSimpleName ( ); // invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;
		 return;
	 } // .end method
	 public zongfuscated.r ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 this.b = p1;
		 this.c = p2;
		 return;
	 } // .end method
	 /* # virtual methods */
	 public final java.lang.String a ( ) {
		 /* .locals 8 */
		 int v7 = 1; // const/4 v7, 0x1
		 int v6 = 0; // const/4 v6, 0x0
		 int v0 = 0; // const/4 v0, 0x0
		 v1 = zongfuscated.r.a;
		 final String v2 = "parseSMS"; // const-string v2, "parseSMS"
		 int v3 = 3; // const/4 v3, 0x3
		 /* new-array v3, v3, [Ljava/lang/String; */
		 v4 = this.b;
		 (( java.lang.Integer ) v4 ).toString ( ); // invoke-virtual {v4}, Ljava/lang/Integer;->toString()Ljava/lang/String;
		 /* aput-object v4, v3, v6 */
		 v4 = this.c;
		 /* aput-object v4, v3, v7 */
		 int v4 = 2; // const/4 v4, 0x2
		 v5 = this.d;
		 v5 = this.a;
		 /* aput-object v5, v3, v4 */
		 zongfuscated.q .a ( v1,v2,v3 );
		 v1 = this.c;
		 java.util.regex.Pattern .compile ( v1 );
		 v2 = this.d;
		 v2 = this.a;
		 (( java.util.regex.Pattern ) v1 ).matcher ( v2 ); // invoke-virtual {v1, v2}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;
		 v2 = 		 (( java.util.regex.Matcher ) v1 ).find ( ); // invoke-virtual {v1}, Ljava/util/regex/Matcher;->find()Z
		 if ( v2 != null) { // if-eqz v2, :cond_0
			 v0 = this.b;
			 v0 = 			 (( java.lang.Integer ) v0 ).intValue ( ); // invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I
			 (( java.util.regex.Matcher ) v1 ).group ( v0 ); // invoke-virtual {v1, v0}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;
			 v1 = zongfuscated.r.a;
			 final String v2 = "SMS pincode was validated"; // const-string v2, "SMS pincode was validated"
			 /* new-array v3, v7, [Ljava/lang/String; */
			 /* aput-object v0, v3, v6 */
			 zongfuscated.q .a ( v1,v2,v3 );
		 } // :goto_0
	 } // :cond_0
	 v1 = zongfuscated.r.a;
	 final String v2 = "Pincode not found"; // const-string v2, "Pincode not found"
	 zongfuscated.q .a ( v1,v2 );
} // .end method
public final void a ( Object p0 ) {
	 /* .locals 0 */
	 this.d = p1;
	 return;
} // .end method
