public class org.apache.commons.codec.language.RefinedSoundex implements org.apache.commons.codec.StringEncoder {
	 /* .source "RefinedSoundex.java" */
	 /* # interfaces */
	 /* # static fields */
	 public static final org.apache.commons.codec.language.RefinedSoundex US_ENGLISH;
	 private static final US_ENGLISH_MAPPING;
	 public static final java.lang.String US_ENGLISH_MAPPING_STRING;
	 /* # instance fields */
	 private final soundexMapping;
	 /* # direct methods */
	 static org.apache.commons.codec.language.RefinedSoundex ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 44 */
		 final String v0 = "01360240043788015936020505"; // const-string v0, "01360240043788015936020505"
		 (( java.lang.String ) v0 ).toCharArray ( ); // invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C
		 /* .line 57 */
		 /* new-instance v0, Lorg/apache/commons/codec/language/RefinedSoundex; */
		 /* invoke-direct {v0}, Lorg/apache/commons/codec/language/RefinedSoundex;-><init>()V */
		 return;
	 } // .end method
	 public org.apache.commons.codec.language.RefinedSoundex ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 63 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 64 */
		 v0 = org.apache.commons.codec.language.RefinedSoundex.US_ENGLISH_MAPPING;
		 this.soundexMapping = v0;
		 /* .line 65 */
		 return;
	 } // .end method
	 public org.apache.commons.codec.language.RefinedSoundex ( ) {
		 /* .locals 1 */
		 /* .param p1, "mapping" # Ljava/lang/String; */
		 /* .prologue */
		 /* .line 89 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 90 */
		 (( java.lang.String ) p1 ).toCharArray ( ); // invoke-virtual {p1}, Ljava/lang/String;->toCharArray()[C
		 this.soundexMapping = v0;
		 /* .line 91 */
		 return;
	 } // .end method
	 public org.apache.commons.codec.language.RefinedSoundex ( ) {
		 /* .locals 3 */
		 /* .param p1, "mapping" # [C */
		 /* .prologue */
		 int v2 = 0; // const/4 v2, 0x0
		 /* .line 76 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 77 */
		 /* array-length v0, p1 */
		 /* new-array v0, v0, [C */
		 this.soundexMapping = v0;
		 /* .line 78 */
		 v0 = this.soundexMapping;
		 /* array-length v1, p1 */
		 java.lang.System .arraycopy ( p1,v2,v0,v2,v1 );
		 /* .line 79 */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public Integer difference ( java.lang.String p0, java.lang.String p1 ) {
		 /* .locals 1 */
		 /* .param p1, "s1" # Ljava/lang/String; */
		 /* .param p2, "s2" # Ljava/lang/String; */
		 /* .annotation system Ldalvik/annotation/Throws; */
		 /* value = { */
		 /* Lorg/apache/commons/codec/EncoderException; */
		 /* } */
	 } // .end annotation
	 /* .prologue */
	 /* .line 116 */
	 v0 = 	 org.apache.commons.codec.language.SoundexUtils .difference ( p0,p1,p2 );
} // .end method
public java.lang.Object encode ( java.lang.Object p0 ) {
	 /* .locals 2 */
	 /* .param p1, "obj" # Ljava/lang/Object; */
	 /* .annotation system Ldalvik/annotation/Throws; */
	 /* value = { */
	 /* Lorg/apache/commons/codec/EncoderException; */
	 /* } */
} // .end annotation
/* .prologue */
/* .line 134 */
/* instance-of v0, p1, Ljava/lang/String; */
/* if-nez v0, :cond_0 */
/* .line 135 */
/* new-instance v0, Lorg/apache/commons/codec/EncoderException; */
final String v1 = "Parameter supplied to RefinedSoundex encode is not of type java.lang.String"; // const-string v1, "Parameter supplied to RefinedSoundex encode is not of type java.lang.String"
/* invoke-direct {v0, v1}, Lorg/apache/commons/codec/EncoderException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
/* .line 137 */
} // :cond_0
/* check-cast p1, Ljava/lang/String; */
} // .end local p1 # "obj":Ljava/lang/Object;
(( org.apache.commons.codec.language.RefinedSoundex ) p0 ).soundex ( p1 ); // invoke-virtual {p0, p1}, Lorg/apache/commons/codec/language/RefinedSoundex;->soundex(Ljava/lang/String;)Ljava/lang/String;
} // .end method
public java.lang.String encode ( java.lang.String p0 ) {
/* .locals 1 */
/* .param p1, "str" # Ljava/lang/String; */
/* .prologue */
/* .line 149 */
(( org.apache.commons.codec.language.RefinedSoundex ) p0 ).soundex ( p1 ); // invoke-virtual {p0, p1}, Lorg/apache/commons/codec/language/RefinedSoundex;->soundex(Ljava/lang/String;)Ljava/lang/String;
} // .end method
Object getMappingCode ( Object p0 ) {
/* .locals 2 */
/* .param p1, "c" # C */
/* .prologue */
/* .line 162 */
v0 = java.lang.Character .isLetter ( p1 );
/* if-nez v0, :cond_0 */
/* .line 163 */
int v0 = 0; // const/4 v0, 0x0
/* .line 165 */
} // :goto_0
} // :cond_0
v0 = this.soundexMapping;
v1 = java.lang.Character .toUpperCase ( p1 );
/* add-int/lit8 v1, v1, -0x41 */
/* aget-char v0, v0, v1 */
} // .end method
public java.lang.String soundex ( java.lang.String p0 ) {
/* .locals 5 */
/* .param p1, "str" # Ljava/lang/String; */
/* .prologue */
/* .line 176 */
/* if-nez p1, :cond_0 */
/* .line 177 */
int v4 = 0; // const/4 v4, 0x0
/* .line 203 */
} // :goto_0
/* .line 179 */
} // :cond_0
org.apache.commons.codec.language.SoundexUtils .clean ( p1 );
/* .line 180 */
v4 = (( java.lang.String ) p1 ).length ( ); // invoke-virtual {p1}, Ljava/lang/String;->length()I
/* if-nez v4, :cond_1 */
/* move-object v4, p1 */
/* .line 181 */
/* .line 184 */
} // :cond_1
/* new-instance v3, Ljava/lang/StringBuilder; */
/* invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V */
/* .line 185 */
/* .local v3, "sBuf":Ljava/lang/StringBuilder; */
int v4 = 0; // const/4 v4, 0x0
v4 = (( java.lang.String ) p1 ).charAt ( v4 ); // invoke-virtual {p1, v4}, Ljava/lang/String;->charAt(I)C
(( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
/* .line 188 */
/* const/16 v2, 0x2a */
/* .line 190 */
/* .local v2, "last":C */
int v1 = 0; // const/4 v1, 0x0
/* .local v1, "i":I */
} // :goto_1
v4 = (( java.lang.String ) p1 ).length ( ); // invoke-virtual {p1}, Ljava/lang/String;->length()I
/* if-ge v1, v4, :cond_4 */
/* .line 192 */
v4 = (( java.lang.String ) p1 ).charAt ( v1 ); // invoke-virtual {p1, v1}, Ljava/lang/String;->charAt(I)C
v0 = (( org.apache.commons.codec.language.RefinedSoundex ) p0 ).getMappingCode ( v4 ); // invoke-virtual {p0, v4}, Lorg/apache/commons/codec/language/RefinedSoundex;->getMappingCode(C)C
/* .line 193 */
/* .local v0, "current":C */
/* if-ne v0, v2, :cond_2 */
/* .line 190 */
} // :goto_2
/* add-int/lit8 v1, v1, 0x1 */
/* .line 195 */
} // :cond_2
if ( v0 != null) { // if-eqz v0, :cond_3
/* .line 196 */
(( java.lang.StringBuilder ) v3 ).append ( v0 ); // invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
/* .line 199 */
} // :cond_3
/* move v2, v0 */
/* .line 203 */
} // .end local v0 # "current":C
} // :cond_4
(( java.lang.StringBuilder ) v3 ).toString ( ); // invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
} // .end method
