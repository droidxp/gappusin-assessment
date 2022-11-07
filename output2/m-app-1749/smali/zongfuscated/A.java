public class zongfuscated.a extends zongfuscated.r {
	 /* # static fields */
	 private static final java.lang.String a;
	 /* # direct methods */
	 static zongfuscated.a ( ) {
		 /* .locals 1 */
		 /* const-class v0, Lzongfuscated/a; */
		 (( java.lang.Class ) v0 ).getSimpleName ( ); // invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;
		 return;
	 } // .end method
	 public zongfuscated.a ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0, p1, p2}, Lzongfuscated/r;-><init>(Ljava/lang/Integer;Ljava/lang/String;)V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public final java.lang.String a ( Boolean p0, java.lang.String p1 ) {
		 /* .locals 3 */
		 if ( p1 != null) { // if-eqz p1, :cond_1
			 v0 = 			 (( java.lang.String ) p2 ).length ( ); // invoke-virtual {p2}, Ljava/lang/String;->length()I
			 /* add-int/lit8 v0, v0, -0x3 */
			 (( java.lang.String ) p2 ).substring ( v0 ); // invoke-virtual {p2, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;
			 final String v2 = "00"; // const-string v2, "00"
			 v2 = 			 (( java.lang.String ) v1 ).contains ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z
			 if ( v2 != null) { // if-eqz v2, :cond_0
				 /* new-instance v1, Ljava/lang/StringBuilder; */
				 final String v2 = "9999"; // const-string v2, "9999"
				 /* invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
				 /* add-int/lit8 v0, v0, 0x1 */
				 (( java.lang.String ) p2 ).substring ( v0 ); // invoke-virtual {p2, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;
				 (( java.lang.StringBuilder ) v1 ).append ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
				 (( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
			 } // :goto_0
			 v1 = zongfuscated.a.a;
			 final String v2 = "FlowFR::Simulation mode pinCode generator"; // const-string v2, "FlowFR::Simulation mode pinCode generator"
			 zongfuscated.q .a ( v1,v2 );
		 } // :goto_1
	 } // :cond_0
	 /* new-instance v0, Ljava/lang/StringBuilder; */
	 final String v2 = "999"; // const-string v2, "999"
	 /* invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
	 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 (( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
} // :cond_1
(( zongfuscated.a ) p0 ).a ( ); // invoke-virtual {p0}, Lzongfuscated/a;->a()Ljava/lang/String;
v1 = zongfuscated.a.a;
final String v2 = "FlowFR::Live mode pinCode parsing"; // const-string v2, "FlowFR::Live mode pinCode parsing"
zongfuscated.q .a ( v1,v2 );
} // .end method
