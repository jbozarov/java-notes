    
    
    
    @Test
    public void willReturnValidBody() throws JsonProcessingException {
        Handler handler = new Handler();
        APIGatewayV2ProxyResponseEvent result = getProductQualityHandler.handleRequest(event, new TestContext());
        Approvals.verifyAsJson(new ObjectMapper().readValue(result.getBody(), Map.class));
    }
