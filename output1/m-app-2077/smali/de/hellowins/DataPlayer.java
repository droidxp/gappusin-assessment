class de.hellowins.DataPlayer implements java.lang.Comparable {
	 /* .source "DataPlayer.java" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Ljava/lang/Object;", */
	 /* "Ljava/lang/Comparable", */
	 /* "<", */
	 /* "Lde/hellowins/DataPlayer;", */
	 /* ">;" */
	 /* } */
} // .end annotation
/* # instance fields */
java.lang.String playerId;
Integer score;
/* # direct methods */
 de.hellowins.DataPlayer ( ) {
	 /* .locals 1 */
	 /* .prologue */
	 /* .line 3 */
	 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
	 /* .line 5 */
	 final String v0 = ""; // const-string v0, ""
	 this.playerId = v0;
	 /* .line 7 */
	 int v0 = 0; // const/4 v0, 0x0
	 /* iput v0, p0, Lde/hellowins/DataPlayer;->score:I */
	 /* .line 3 */
	 return;
} // .end method
/* # virtual methods */
public Integer compareTo ( de.hellowins.DataPlayer p0 ) {
	 /* .locals 3 */
	 /* .param p1, "another" # Lde/hellowins/DataPlayer; */
	 /* .prologue */
	 /* .line 11 */
	 int v0 = 0; // const/4 v0, 0x0
	 /* .line 13 */
	 /* .local v0, "ret":I */
	 v1 = this.playerId;
	 v2 = this.playerId;
	 v1 = 	 (( java.lang.String ) v1 ).equals ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
	 if ( v1 != null) { // if-eqz v1, :cond_0
		 int v1 = 0; // const/4 v1, 0x0
		 /* .line 20 */
	 } // :goto_0
	 /* .line 15 */
} // :cond_0
/* iget v1, p0, Lde/hellowins/DataPlayer;->score:I */
/* iget v2, p1, Lde/hellowins/DataPlayer;->score:I */
/* if-ge v1, v2, :cond_2 */
/* .line 16 */
int v0 = 1; // const/4 v0, 0x1
} // :cond_1
} // :goto_1
/* move v1, v0 */
/* .line 20 */
/* .line 17 */
} // :cond_2
/* iget v1, p0, Lde/hellowins/DataPlayer;->score:I */
/* iget v2, p1, Lde/hellowins/DataPlayer;->score:I */
/* if-le v1, v2, :cond_1 */
/* .line 18 */
int v0 = -1; // const/4 v0, -0x1
} // .end method
public Integer compareTo ( java.lang.Object p0 ) { //bridge//synthethic
/* .locals 1 */
/* .prologue */
/* .line 1 */
/* check-cast p1, Lde/hellowins/DataPlayer; */
v0 = (( de.hellowins.DataPlayer ) p0 ).compareTo ( p1 ); // invoke-virtual {p0, p1}, Lde/hellowins/DataPlayer;->compareTo(Lde/hellowins/DataPlayer;)I
} // .end method
