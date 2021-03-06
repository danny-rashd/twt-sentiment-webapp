package com.example.twitterbackend.corenlp;

import edu.stanford.nlp.pipeline.StanfordCoreNLP;

import java.util.Properties;

public class SentimentPipeline {
    private static Properties properties;
    private static String propertiesName="tokenize, ssplit, pos, parse, lemma, ner, sentiment";
    private static StanfordCoreNLP stanfordCoreNLP;

    private SentimentPipeline (){

    }
    static{
        properties = new Properties();
        properties.setProperty("annotators",propertiesName);
    }

    public static StanfordCoreNLP getPipeline(){
        if (stanfordCoreNLP==null){
            stanfordCoreNLP= new StanfordCoreNLP(properties);
        }
        return stanfordCoreNLP;
    }
}