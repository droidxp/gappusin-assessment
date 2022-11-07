public class net.chobin.android.a.v {
	 /* # instance fields */
	 public Integer a;
	 public Long a;
	 public java.lang.String a;
	 public Integer b;
	 public java.lang.String b;
	 public java.lang.String c;
	 public java.lang.String d;
	 /* # direct methods */
	 public net.chobin.android.a.v ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 public static net.chobin.android.a.v a ( java.lang.String p0 ) {
		 /* .locals 5 */
		 int v4 = 0; // const/4 v4, 0x0
		 /* const/16 v0, 0x3a */
		 v0 = 		 (( java.lang.String ) p0 ).indexOf ( v0 ); // invoke-virtual {p0, v0}, Ljava/lang/String;->indexOf(I)I
		 int v1 = -1; // const/4 v1, -0x1
		 /* if-ne v1, v0, :cond_0 */
		 final String v0 = ""; // const-string v0, ""
	 } // :goto_0
	 final String v1 = "|"; // const-string v1, "|"
	 java.util.regex.Pattern .quote ( v1 );
	 android.text.TextUtils .split ( p0,v1 );
	 /* array-length v2, v1 */
	 int v3 = 6; // const/4 v3, 0x6
	 /* if-ge v2, v3, :cond_2 */
	 /* new-instance v0, Ljava/lang/IllegalArgumentException; */
	 final String v1 = "Wrong number of fields."; // const-string v1, "Wrong number of fields."
	 /* invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
	 /* throw v0 */
} // :cond_0
(( java.lang.String ) p0 ).substring ( v4, v0 ); // invoke-virtual {p0, v4, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;
v2 = (( java.lang.String ) p0 ).length ( ); // invoke-virtual {p0}, Ljava/lang/String;->length()I
/* if-lt v0, v2, :cond_1 */
final String v0 = ""; // const-string v0, ""
} // :goto_1
/* move-object p0, v1 */
} // :cond_1
/* add-int/lit8 v0, v0, 0x1 */
(( java.lang.String ) p0 ).substring ( v0 ); // invoke-virtual {p0, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;
} // :cond_2
/* new-instance v2, Lnet/chobin/android/a/v; */
/* invoke-direct {v2}, Lnet/chobin/android/a/v;-><init>()V */
this.d = v0;
/* aget-object v0, v1, v4 */
v0 = java.lang.Integer .parseInt ( v0 );
/* iput v0, v2, Lnet/chobin/android/a/v;->a:I */
int v0 = 1; // const/4 v0, 0x1
/* aget-object v0, v1, v0 */
v0 = java.lang.Integer .parseInt ( v0 );
/* iput v0, v2, Lnet/chobin/android/a/v;->b:I */
int v0 = 2; // const/4 v0, 0x2
/* aget-object v0, v1, v0 */
this.a = v0;
int v0 = 3; // const/4 v0, 0x3
/* aget-object v0, v1, v0 */
this.b = v0;
int v0 = 4; // const/4 v0, 0x4
/* aget-object v0, v1, v0 */
this.c = v0;
int v0 = 5; // const/4 v0, 0x5
/* aget-object v0, v1, v0 */
java.lang.Long .parseLong ( v0 );
/* move-result-wide v0 */
/* iput-wide v0, v2, Lnet/chobin/android/a/v;->a:J */
} // .end method
/* # virtual methods */
public java.lang.String toString ( ) {
/* .locals 5 */
final String v0 = "|"; // const-string v0, "|"
int v1 = 6; // const/4 v1, 0x6
/* new-array v1, v1, [Ljava/lang/Object; */
int v2 = 0; // const/4 v2, 0x0
/* iget v3, p0, Lnet/chobin/android/a/v;->a:I */
java.lang.Integer .valueOf ( v3 );
/* aput-object v3, v1, v2 */
int v2 = 1; // const/4 v2, 0x1
/* iget v3, p0, Lnet/chobin/android/a/v;->b:I */
java.lang.Integer .valueOf ( v3 );
/* aput-object v3, v1, v2 */
int v2 = 2; // const/4 v2, 0x2
v3 = this.a;
/* aput-object v3, v1, v2 */
int v2 = 3; // const/4 v2, 0x3
v3 = this.b;
/* aput-object v3, v1, v2 */
int v2 = 4; // const/4 v2, 0x4
v3 = this.c;
/* aput-object v3, v1, v2 */
int v2 = 5; // const/4 v2, 0x5
/* iget-wide v3, p0, Lnet/chobin/android/a/v;->a:J */
java.lang.Long .valueOf ( v3,v4 );
/* aput-object v3, v1, v2 */
android.text.TextUtils .join ( v0,v1 );
} // .end method
