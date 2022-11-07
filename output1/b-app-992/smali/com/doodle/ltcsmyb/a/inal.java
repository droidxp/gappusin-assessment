public class inal {
	 /* # static fields */
	 public static Boolean a;
	 private static com.doodle.ltcsmyb.a.a h;
	 /* # instance fields */
	 private Boolean b;
	 private Boolean c;
	 private Boolean d;
	 private java.lang.String e;
	 private java.lang.String f;
	 private java.lang.String g;
	 private android.content.Context i;
	 private android.content.SharedPreferences j;
	 private k;
	 private Boolean l;
	 private Boolean m;
	 private n;
	 private o;
	 private final Integer p;
	 /* # direct methods */
	 static inal ( ) {
		 /* .locals 1 */
		 int v0 = 0; // const/4 v0, 0x0
		 int v0 = 0; // const/4 v0, 0x0
		 com.doodle.ltcsmyb.a.a.a = (v0!= 0);
		 return;
	 } // .end method
	 private inal ( ) {
		 /* .locals 5 */
		 /* const/16 v4, 0xa */
		 int v3 = 0; // const/4 v3, 0x0
		 /* const/16 v2, 0x7d */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* new-array v0, v4, [I */
		 this.k = v0;
		 /* iput v2, p0, Lcom/doodle/ltcsmyb/a/a;->p:I */
		 this.i = p1;
		 v0 = this.i;
		 final String v1 = "settings"; // const-string v1, "settings"
		 (( android.content.Context ) v0 ).getSharedPreferences ( v1, v3 ); // invoke-virtual {v0, v1, v3}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;
		 this.j = v0;
		 /* new-array v0, v4, [Ljava/lang/String; */
		 this.f = v0;
		 /* new-array v0, v2, [Ljava/lang/String; */
		 this.g = v0;
		 /* new-array v0, v2, [Ljava/lang/String; */
		 this.e = v0;
		 /* new-array v0, v2, [I */
		 this.n = v0;
		 /* new-array v0, v2, [I */
		 this.o = v0;
		 /* move v0, v3 */
	 } // :goto_0
	 /* if-ge v0, v2, :cond_0 */
	 v1 = this.n;
	 /* aput v3, v1, v0 */
	 /* add-int/lit8 v0, v0, 0x1 */
} // :cond_0
return;
} // .end method
public static com.doodle.ltcsmyb.a.a a ( android.content.Context p0 ) {
/* .locals 1 */
v0 = com.doodle.ltcsmyb.a.a.h;
/* if-nez v0, :cond_0 */
/* new-instance v0, Lcom/doodle/ltcsmyb/a/a; */
/* invoke-direct {v0, p0}, Lcom/doodle/ltcsmyb/a/a;-><init>(Landroid/content/Context;)V */
} // :cond_0
v0 = com.doodle.ltcsmyb.a.a.h;
} // .end method
/* # virtual methods */
public final Integer a ( Integer p0 ) {
/* .locals 4 */
/* if-ltz p1, :cond_0 */
/* const/16 v0, 0x7d */
/* if-ge p1, v0, :cond_0 */
v0 = this.g;
v1 = this.j;
/* new-instance v2, Ljava/lang/StringBuilder; */
/* invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V */
final String v3 = "PASSLEVEL"; // const-string v3, "PASSLEVEL"
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).append ( p1 ); // invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
int v3 = 0; // const/4 v3, 0x0
/* aput-object v1, v0, p1 */
v0 = this.g;
/* aget-object v0, v0, p1 */
/* if-nez v0, :cond_1 */
v0 = this.n;
int v1 = 0; // const/4 v1, 0x0
/* aput v1, v0, p1 */
} // :cond_0
} // :goto_0
v0 = this.n;
/* aget v0, v0, p1 */
} // :cond_1
v0 = this.n;
v1 = this.g;
/* aget-object v1, v1, p1 */
com.doodle.ltcsmyb.a.c .b ( v1 );
v1 = java.lang.Integer .parseInt ( v1 );
/* aput v1, v0, p1 */
} // .end method
public final void a ( Integer p0, Integer p1 ) {
/* .locals 3 */
/* if-ltz p1, :cond_0 */
/* const/16 v0, 0x7d */
/* if-ge p1, v0, :cond_0 */
v0 = this.g;
java.lang.String .valueOf ( p2 );
com.doodle.ltcsmyb.a.c .a ( v1 );
/* aput-object v1, v0, p1 */
v0 = this.j;
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "PASSLEVEL"; // const-string v2, "PASSLEVEL"
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).append ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
v2 = this.g;
/* aget-object v2, v2, p1 */
} // :cond_0
return;
} // .end method
public final void a ( Boolean p0 ) {
/* .locals 2 */
v0 = this.j;
final String v1 = "SoundOn"; // const-string v1, "SoundOn"
return;
} // .end method
public final a ( ) {
/* .locals 6 */
int v5 = 0; // const/4 v5, 0x0
/* move v0, v5 */
} // :goto_0
/* const/16 v1, 0x7d */
/* if-ge v0, v1, :cond_1 */
v1 = this.e;
v2 = this.j;
/* new-instance v3, Ljava/lang/StringBuilder; */
/* invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V */
final String v4 = "STAR"; // const-string v4, "STAR"
(( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v3 ).append ( v0 ); // invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v3 ).toString ( ); // invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
int v4 = 0; // const/4 v4, 0x0
/* aput-object v2, v1, v0 */
v1 = this.e;
/* aget-object v1, v1, v0 */
/* if-nez v1, :cond_0 */
v1 = this.o;
/* aput v5, v1, v0 */
} // :goto_1
/* add-int/lit8 v0, v0, 0x1 */
} // :cond_0
v1 = this.o;
v2 = this.e;
/* aget-object v2, v2, v0 */
com.doodle.ltcsmyb.a.c .b ( v2 );
v2 = java.lang.Integer .parseInt ( v2 );
/* aput v2, v1, v0 */
} // :cond_1
v0 = this.o;
(( ) v0 ).clone ( ); // invoke-virtual {v0}, [I->clone()Ljava/lang/Object;
/* check-cast p0, [I */
} // .end method
public final Integer b ( Integer p0 ) {
/* .locals 5 */
int v4 = 0; // const/4 v4, 0x0
/* if-ltz p1, :cond_1 */
/* const/16 v0, 0x7d */
/* if-ge p1, v0, :cond_1 */
v0 = this.e;
v1 = this.j;
/* new-instance v2, Ljava/lang/StringBuilder; */
/* invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V */
final String v3 = "STAR"; // const-string v3, "STAR"
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).append ( p1 ); // invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
int v3 = 0; // const/4 v3, 0x0
/* aput-object v1, v0, p1 */
v0 = this.e;
/* aget-object v0, v0, p1 */
/* if-nez v0, :cond_0 */
v0 = this.o;
/* aput v4, v0, p1 */
} // :goto_0
v0 = this.o;
/* aget v0, v0, p1 */
} // :goto_1
} // :cond_0
v0 = this.o;
v1 = this.e;
/* aget-object v1, v1, p1 */
com.doodle.ltcsmyb.a.c .b ( v1 );
v1 = java.lang.Integer .parseInt ( v1 );
/* aput v1, v0, p1 */
} // :cond_1
/* move v0, v4 */
} // .end method
public final void b ( Integer p0, Integer p1 ) {
/* .locals 3 */
/* if-ltz p1, :cond_0 */
/* const/16 v0, 0x7d */
/* if-ge p1, v0, :cond_0 */
v0 = this.e;
java.lang.String .valueOf ( p2 );
com.doodle.ltcsmyb.a.c .a ( v1 );
/* aput-object v1, v0, p1 */
v0 = this.j;
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "STAR"; // const-string v2, "STAR"
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).append ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
v2 = this.e;
/* aget-object v2, v2, p1 */
} // :cond_0
return;
} // .end method
public final void b ( Boolean p0 ) {
/* .locals 2 */
v0 = this.j;
final String v1 = "MusicOn"; // const-string v1, "MusicOn"
return;
} // .end method
public final Boolean b ( ) {
/* .locals 3 */
v0 = this.j;
final String v1 = "SoundOn"; // const-string v1, "SoundOn"
v0 = int v2 = 1; // const/4 v2, 0x1
/* iput-boolean v0, p0, Lcom/doodle/ltcsmyb/a/a;->l:Z */
/* iget-boolean v0, p0, Lcom/doodle/ltcsmyb/a/a;->l:Z */
} // .end method
public final Boolean c ( ) {
/* .locals 3 */
v0 = this.j;
final String v1 = "MusicOn"; // const-string v1, "MusicOn"
v0 = int v2 = 1; // const/4 v2, 0x1
/* iput-boolean v0, p0, Lcom/doodle/ltcsmyb/a/a;->m:Z */
/* iget-boolean v0, p0, Lcom/doodle/ltcsmyb/a/a;->m:Z */
} // .end method
public final Boolean d ( ) {
/* .locals 3 */
v0 = this.j;
final String v1 = "NORMALFIRSTTOUCH"; // const-string v1, "NORMALFIRSTTOUCH"
v0 = int v2 = 0; // const/4 v2, 0x0
/* iput-boolean v0, p0, Lcom/doodle/ltcsmyb/a/a;->b:Z */
/* iget-boolean v0, p0, Lcom/doodle/ltcsmyb/a/a;->b:Z */
} // .end method
public final Boolean e ( ) {
/* .locals 3 */
v0 = this.j;
final String v1 = "EXPERTFIRSTTOUCH"; // const-string v1, "EXPERTFIRSTTOUCH"
v0 = int v2 = 0; // const/4 v2, 0x0
/* iput-boolean v0, p0, Lcom/doodle/ltcsmyb/a/a;->c:Z */
/* iget-boolean v0, p0, Lcom/doodle/ltcsmyb/a/a;->c:Z */
} // .end method
public final Boolean f ( ) {
/* .locals 3 */
v0 = this.j;
final String v1 = "INSANEFIRSTTOUCH"; // const-string v1, "INSANEFIRSTTOUCH"
v0 = int v2 = 0; // const/4 v2, 0x0
/* iput-boolean v0, p0, Lcom/doodle/ltcsmyb/a/a;->d:Z */
/* iget-boolean v0, p0, Lcom/doodle/ltcsmyb/a/a;->d:Z */
} // .end method
public final Boolean g ( ) {
/* .locals 3 */
v0 = this.j;
final String v1 = "allfirstshow"; // const-string v1, "allfirstshow"
v0 = int v2 = 1; // const/4 v2, 0x1
} // .end method
public final Boolean h ( ) {
/* .locals 3 */
v0 = this.j;
final String v1 = "Stfirstshow"; // const-string v1, "Stfirstshow"
v0 = int v2 = 1; // const/4 v2, 0x1
} // .end method
public final Boolean i ( ) {
/* .locals 3 */
v0 = this.j;
final String v1 = "mFirstTurnLeft"; // const-string v1, "mFirstTurnLeft"
v0 = int v2 = 0; // const/4 v2, 0x0
} // .end method
public final void j ( ) {
/* .locals 3 */
v0 = this.j;
final String v1 = "mFirstTurnLeft"; // const-string v1, "mFirstTurnLeft"
int v2 = 1; // const/4 v2, 0x1
return;
} // .end method
public final void k ( ) {
/* .locals 3 */
v0 = this.j;
final String v1 = "allfirstshow"; // const-string v1, "allfirstshow"
int v2 = 0; // const/4 v2, 0x0
return;
} // .end method
public final void l ( ) {
/* .locals 3 */
v0 = this.j;
final String v1 = "Stfirstshow"; // const-string v1, "Stfirstshow"
int v2 = 0; // const/4 v2, 0x0
return;
} // .end method
public final void m ( ) {
/* .locals 3 */
v0 = this.j;
final String v1 = "NORMALFIRSTTOUCH"; // const-string v1, "NORMALFIRSTTOUCH"
int v2 = 1; // const/4 v2, 0x1
return;
} // .end method
public final void n ( ) {
/* .locals 3 */
v0 = this.j;
final String v1 = "INSANEFIRSTTOUCH"; // const-string v1, "INSANEFIRSTTOUCH"
int v2 = 1; // const/4 v2, 0x1
return;
} // .end method
public final void o ( ) {
/* .locals 3 */
v0 = this.j;
final String v1 = "EXPERTFIRSTTOUCH"; // const-string v1, "EXPERTFIRSTTOUCH"
int v2 = 1; // const/4 v2, 0x1
return;
} // .end method
public final void p ( ) {
/* .locals 5 */
int v2 = 1; // const/4 v2, 0x1
int v4 = 0; // const/4 v4, 0x0
v0 = this.j;
final String v1 = "SoundOn"; // const-string v1, "SoundOn"
final String v1 = "MusicOn"; // const-string v1, "MusicOn"
final String v1 = "INSANEFIRSTTOUCH"; // const-string v1, "INSANEFIRSTTOUCH"
final String v1 = "EXPERTFIRSTTOUCH"; // const-string v1, "EXPERTFIRSTTOUCH"
final String v1 = "NORMALFIRSTTOUCH"; // const-string v1, "NORMALFIRSTTOUCH"
/* move v1, v4 */
} // :goto_0
/* const/16 v2, 0x7d */
/* if-ge v1, v2, :cond_0 */
v2 = this.g;
java.lang.String .valueOf ( v4 );
com.doodle.ltcsmyb.a.c .a ( v3 );
/* aput-object v3, v2, v1 */
/* new-instance v2, Ljava/lang/StringBuilder; */
/* invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V */
final String v3 = "PASSLEVEL"; // const-string v3, "PASSLEVEL"
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).append ( v1 ); // invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
v3 = this.g;
/* aget-object v3, v3, v1 */
v2 = this.e;
java.lang.String .valueOf ( v4 );
com.doodle.ltcsmyb.a.c .a ( v3 );
/* aput-object v3, v2, v1 */
/* new-instance v2, Ljava/lang/StringBuilder; */
/* invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V */
final String v3 = "STAR"; // const-string v3, "STAR"
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).append ( v1 ); // invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
v3 = this.e;
/* aget-object v3, v3, v1 */
/* add-int/lit8 v1, v1, 0x1 */
} // :cond_0
return;
} // .end method
public final Integer q ( ) {
/* .locals 7 */
int v6 = 0; // const/4 v6, 0x0
/* move v0, v6 */
/* move v1, v6 */
} // :goto_0
/* const/16 v2, 0x7d */
/* if-ge v0, v2, :cond_1 */
v2 = this.g;
v3 = this.j;
/* new-instance v4, Ljava/lang/StringBuilder; */
/* invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V */
final String v5 = "PASSLEVEL"; // const-string v5, "PASSLEVEL"
(( java.lang.StringBuilder ) v4 ).append ( v5 ); // invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v4 ).append ( v0 ); // invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v4 ).toString ( ); // invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
int v5 = 0; // const/4 v5, 0x0
/* aput-object v3, v2, v0 */
v2 = this.g;
/* aget-object v2, v2, v0 */
/* if-nez v2, :cond_0 */
v2 = this.n;
/* aput v6, v2, v0 */
} // :goto_1
v2 = this.n;
/* aget v2, v2, v0 */
/* add-int/2addr v1, v2 */
/* add-int/lit8 v0, v0, 0x1 */
} // :cond_0
v2 = this.n;
v3 = this.g;
/* aget-object v3, v3, v0 */
com.doodle.ltcsmyb.a.c .b ( v3 );
v3 = java.lang.Integer .parseInt ( v3 );
/* aput v3, v2, v0 */
} // :cond_1
} // .end method
