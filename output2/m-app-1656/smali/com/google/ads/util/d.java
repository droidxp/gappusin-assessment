class com.google.ads.util.d {
	 /* .source "SourceFile" */
	 /* # static fields */
	 static final com.google.ads.util.d d;
	 static final com.google.ads.util.d e;
	 /* # instance fields */
	 public final java.lang.String a;
	 public final java.lang.String b;
	 public final java.lang.String c;
	 /* # direct methods */
	 static com.google.ads.util.d ( ) {
		 /* .locals 4 */
		 /* .prologue */
		 /* .line 31 */
		 /* new-instance v0, Lcom/google/ads/util/d; */
		 /* invoke-direct {v0}, Lcom/google/ads/util/d;-><init>()V */
		 /* .line 36 */
		 /* new-instance v0, Lcom/google/ads/util/d; */
		 final String v1 = "unknown"; // const-string v1, "unknown"
		 final String v2 = "generic"; // const-string v2, "generic"
		 final String v3 = "generic"; // const-string v3, "generic"
		 /* invoke-direct {v0, v1, v2, v3}, Lcom/google/ads/util/d;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V */
		 return;
	 } // .end method
	 com.google.ads.util.d ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 42 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 43 */
		 v0 = android.os.Build.BOARD;
		 this.a = v0;
		 /* .line 44 */
		 v0 = android.os.Build.DEVICE;
		 this.b = v0;
		 /* .line 45 */
		 v0 = android.os.Build.BRAND;
		 this.c = v0;
		 /* .line 46 */
		 return;
	 } // .end method
	 com.google.ads.util.d ( ) {
		 /* .locals 0 */
		 /* .prologue */
		 /* .line 51 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 52 */
		 this.a = p1;
		 /* .line 53 */
		 this.b = p2;
		 /* .line 54 */
		 this.c = p3;
		 /* .line 55 */
		 return;
	 } // .end method
	 private static Boolean a ( java.lang.String p0, java.lang.String p1 ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 76 */
		 if ( p0 != null) { // if-eqz p0, :cond_0
			 /* .line 77 */
			 v0 = 			 (( java.lang.String ) p0 ).equals ( p1 ); // invoke-virtual {p0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
			 /* .line 79 */
		 } // :goto_0
	 } // :cond_0
	 /* if-ne p0, p1, :cond_1 */
	 int v0 = 1; // const/4 v0, 0x1
} // :cond_1
int v0 = 0; // const/4 v0, 0x0
} // .end method
/* # virtual methods */
public Boolean equals ( java.lang.Object p0 ) {
/* .locals 3 */
/* .param p1, "o" # Ljava/lang/Object; */
/* .prologue */
int v0 = 0; // const/4 v0, 0x0
/* .line 62 */
/* instance-of v1, p1, Lcom/google/ads/util/d; */
/* if-nez v1, :cond_1 */
/* .line 66 */
} // .end local p1 # "o":Ljava/lang/Object;
} // :cond_0
} // :goto_0
/* .line 65 */
/* .restart local p1 # "o":Ljava/lang/Object; */
} // :cond_1
/* check-cast p1, Lcom/google/ads/util/d; */
/* .line 66 */
} // .end local p1 # "o":Ljava/lang/Object;
v1 = this.a;
v2 = this.a;
v1 = com.google.ads.util.d .a ( v1,v2 );
if ( v1 != null) { // if-eqz v1, :cond_0
v1 = this.b;
v2 = this.b;
v1 = com.google.ads.util.d .a ( v1,v2 );
if ( v1 != null) { // if-eqz v1, :cond_0
v1 = this.c;
v2 = this.c;
v1 = com.google.ads.util.d .a ( v1,v2 );
if ( v1 != null) { // if-eqz v1, :cond_0
int v0 = 1; // const/4 v0, 0x1
} // .end method
public Integer hashCode ( ) {
/* .locals 2 */
/* .prologue */
/* .line 88 */
int v0 = 0; // const/4 v0, 0x0
/* .line 89 */
v1 = this.a;
if ( v1 != null) { // if-eqz v1, :cond_0
/* .line 90 */
v1 = this.a;
v1 = (( java.lang.String ) v1 ).hashCode ( ); // invoke-virtual {v1}, Ljava/lang/String;->hashCode()I
/* add-int/2addr v0, v1 */
/* .line 92 */
} // :cond_0
v1 = this.b;
if ( v1 != null) { // if-eqz v1, :cond_1
/* .line 93 */
v1 = this.b;
v1 = (( java.lang.String ) v1 ).hashCode ( ); // invoke-virtual {v1}, Ljava/lang/String;->hashCode()I
/* add-int/2addr v0, v1 */
/* .line 95 */
} // :cond_1
v1 = this.c;
if ( v1 != null) { // if-eqz v1, :cond_2
/* .line 96 */
v1 = this.c;
v1 = (( java.lang.String ) v1 ).hashCode ( ); // invoke-virtual {v1}, Ljava/lang/String;->hashCode()I
/* add-int/2addr v0, v1 */
/* .line 98 */
} // :cond_2
} // .end method
